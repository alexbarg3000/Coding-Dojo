from __future__ import unicode_literals
from django.db import models
import re
import bcrypt
from datetime import datetime

USERNAME_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+$')
NAME_REGEX = re.compile(r'^[a-zA-Z]+$')


class UserManager(models.Manager):
    def validator(self, postData):
        errors = {}
        if len(postData['fname']) < 2:
            errors['fnamelen'] = "First name must be at least 2 characters."
        elif not NAME_REGEX.match(postData['fname']):
            errors['fnamevalid'] = "First name must only contain letters."
        if len(postData['lname']) < 2:
            errors['lnamelen'] = "Last name must be at least 2 characters."
        elif not NAME_REGEX.match(postData['lname']):
            errors['lnamevalid'] = "Last name must only contain letters."
        if len(postData['username']) < 1:
            errors['usernamelen'] = "username is required."
        elif not USERNAME_REGEX.match(postData['username']):
            errors['usernamelvalid'] = "username is not valid."
        elif User.objects.filter(username=postData['username']):
            errors['usernametaken'] = "username was already registered."
        if len(postData['password']) < 8:
            errors['passlen'] = "Password must be at least 8 characters."
        if postData['password'] != postData['conpass']:
            errors['passconpass'] = "Passwords do not match."
        return errors
    # This is the registration validator. It runs when the site routes to the
    # '/register' page to determine if everything follows the validations and
    # whether to add user and to proceed to welcome page

    def loginvalidator(self, postData):
        errors = {}
        if len(postData['username']) < 1:
            errors['no_username'] = "Please input a username."
        elif not USERNAME_REGEX.match(postData['username']):
            errors['username_valid'] = "username is not valid."
        elif not User.objects.filter(username=postData['username']):
            errors['username_exist'] = "This username is not registered in our database."
        if len(postData['password']) < 1:
            errors['no_pass'] = "Please input a password."
        elif len(postData['password']) < 8:
            errors['short_pass'] = "Incorrect password: less than 8 characters."
        elif bcrypt.checkpw(postData['password'].encode(), User.objects.get(username=postData['username']).password.encode()) == False:
            errors['incorrect_pass'] = "Incorrect password: does not match password stored in database."
        return errors
    # This is the login validator. It runs when the site routes to the
    # '/login' page after the user has submitted their information.
    # It determines if everything follows the validations and whether
    # to log in the user and present the welcome page


class User(models.Model):
    first_name = models.CharField(max_length = 255, null=True)
    last_name = models.CharField(max_length = 255,null=True)
    username = models.CharField(max_length = 255, null=True)
    password = models.CharField(max_length = 255)
    created_at = models.DateTimeField(auto_now_add = True)
    updated_at = models.DateTimeField(auto_now = True)
    objects = UserManager()
# This is the user class which allows us to add in user objects
# with these specific attributes.



class TripManager(models.Manager):
    def validator(self, postData):
        errors = {}
        if len(postData['destination']) < 1:
            errors['destinationlength'] = "Destination field cannot be blank."
        if len(postData['description']) < 1:
            errors['descriptionlength'] = "Description field cannot be blank."
        if len(postData['start_date']) < 1:
            errors['startlength'] = "Date fields cannot be blank."
        elif postData['start_date'] < str(datetime.now()):
            errors['paststart'] = "Start date must be in the future."
        if len(postData['end_date']) < 1:
            errors['endlength'] = "Date fields cannot be blank."
        elif postData['end_date'] < str(datetime.now()):
            errors['pastend'] = "End date must be in the future."
        if postData['start_date'] > postData['end_date']:
            errors['dateerror'] = "Start date must be before the end date."
        return errors
    # This validator function manages the trip class when we are adding
    # a new trip into the database
    # We can later retrieve these errors should any of them be triggered
    # to then display them

class Trip(models.Model):
    destination = models.CharField(max_length = 255)
    description = models.TextField()
    start_date = models.DateTimeField()
    end_date = models.DateTimeField()
    created_at = models.DateTimeField(auto_now_add = True)
    updated_at = models.DateTimeField(auto_now = True)
    users = models.ManyToManyField(User, related_name = "trips")
    objects = TripManager()
    # This is the individual trip class
    # It has a foreign key directing to the User class
    # which exists in the user app
    # I reach that by importing it at the top
