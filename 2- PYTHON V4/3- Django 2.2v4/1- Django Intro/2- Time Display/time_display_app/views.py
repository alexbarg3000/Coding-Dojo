from django.shortcuts import render, HttpResponse, redirect
from django.http import JsonResponse
from time import gmtime, strftime
from datetime import datetime

def index(request):
    context = {
        "time_1": strftime("%b %d, %Y", gmtime()),
        "time_2": strftime("%I:%M%p", gmtime())   
    }
    return render(request, "index.html", context)