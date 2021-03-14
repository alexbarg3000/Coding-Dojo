from django.shortcuts import render, HttpResponse, redirect
from django.http import JsonResponse

def index(request):
    return HttpResponse("placeholder to later display a list of all blogs")

def root(request):
    return redirect('/blogs')

def new(request):
    return HttpResponse("placeholder to display a new form to create a new blog")

def create(request):
    return redirect('/')

def show(request, number):
    return HttpResponse("placeholder to display log number: {0}".format(number))

def edit(request, number):
    return HttpResponse("placeholder to edit blog {}".format(number))

def destroy(request, number):
    return redirect('/blogs')

def bonus(request):
    return JsonResponse({"title": "My first blog", "content": "Lorm, ipsum dolor sit amet consectetur adipisicing elit."})

    #return HttpResponse("placeholder to display log number: {num}".format(num=number))
    #return HttpResponse("placeholder to display log number: {}".format(number))#
    