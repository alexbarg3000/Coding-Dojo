from django.shortcuts import render, redirect
from .models import Dojo, Ninja


def index(request):
    context = {
        "all_the_Dojos": Dojo.objects.all(),
        "all_the_Ninjas": Ninja.objects.all(),
    }
    return render(request, "index.html", context)

def create_dojo(request):
    Dojo.objects.create(name=request.POST['name-html'], city=request.POST['city-html'], state=request.POST['state-html'])
    
    return redirect ("/")

def create_ninja(request):
    Ninja.objects.create(first_name=request.POST['first-name-html'], last_name=request.POST['last-name-html'], dojo=Dojo.objects.get(id=request.POST['ninja-html']))

    return redirect ("/")

def delete(request,i):
    Dojo.objects.filter(id=i).delete()

    return redirect ("/")    



