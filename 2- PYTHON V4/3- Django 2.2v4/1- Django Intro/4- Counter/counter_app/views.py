from django.shortcuts import render, redirect

def index(request):
    if 'counter' in request.session:
        request.session['counter'] +=1
    else:
        request.session['counter']=0

    counter_value= request.session['counter']
    context = {
    	"counter_on_template" : counter_value,
    }

    return render(request,"index.html", context)

def destroy(request):
    del request.session['counter']

    return redirect("/")


def increment(request):
    if 'counter' in request.session:
        request.session['counter'] +=1
    else:
        request.session['counter']=0


    return redirect("/")