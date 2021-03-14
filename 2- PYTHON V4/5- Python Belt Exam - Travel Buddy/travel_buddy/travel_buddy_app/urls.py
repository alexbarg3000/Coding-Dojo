from django.urls import path     
from . import views

urlpatterns = [
    path('', views.routetomain),
    # Navigates to homepage
    # where there are login
    # and registration forms

    path('main', views.index),
    # Also navigates to homepage
    path('login', views.login),
    # Processes login with validations
    # Either proceeds to next page or
    # displays messages as dismissable alerts

    path('register', views.register),
    # Processes registration with validations
    # Either proceeds to next page or
    # displays messages as dismissable alerts

    path('logout', views.logout),
    # Logs the user out	   

    path('travels', views.home),
    # This is the route to the main travels
    # page that is accessed once the user
    # has logged in

    path('travels/add', views.add),
    # This is the route that renders the page
    # to the form that allows a user to add
    # a new trip

    path('travels/destination/<int:number>', views.destination),
    # These are destination specific pages that are
    # accessed when the destination is clicked.
    # They display the trip information

    path('travels/process', views.process),
    # This route takes the add form information
    # and adds it to the user's trip schedule

    path('travels/join/<int:number>', views.join),
    # This allows a user to join another user's
    # trip

    path('travels/leave/<int:number>', views.leave)
    # This allows a user to leave the trip
]