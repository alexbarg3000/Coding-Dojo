from django.shortcuts import render, HttpResponse, redirect

def index(request):
    return render(request,"index.html")

def create_user(request):

    if request.method == 'POST':
        semesters= request.POST.getlist('semester')

    name_from_form = request.POST['name']
    location_from_form = request.POST['location']
    language_from_form = request.POST['language']
    comment_from_form = request.POST['comment']
    preference_from_form = request.POST['preference']
    semester_from_form = semesters

    context = {
    	"name_on_template" : name_from_form,
    	"location_on_template" : location_from_form,
        "language_on_template" : language_from_form,
        "comment_on_template" : comment_from_form,
        "preference_on_template" : preference_from_form,
        "semester_on_template" : semester_from_form,
    }
    return render(request,"show.html",context)