from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path('play', views.game),
    path('again', views.destroy),
    path('score', views.score),
]
