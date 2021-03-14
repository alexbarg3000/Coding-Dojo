from django.db import models
    
class Users(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    email_address = models.CharField(max_length=255)
    age = models.IntegerField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    # def __repr__(self):
    #     return "First Name: {}, Last Name:{}, Email address: {}, Age: {}, created at: {}, updated at: {}".format(self.first_name, self.last_name,self.email_address,self.age,self.created_at,self.updated_at)


      # To change how our models display, we can override the __str__ method in the class.
    # def __str__(self):
    #     return f"<Users object: {self.first_name} {self.last_name} {self.email_address} {self.age}>"