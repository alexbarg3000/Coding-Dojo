from django.shortcuts import render, redirect
from .models  import Book, Author

def index(request):
    context = {
        "all_the_books": Book.objects.all(),
        }
    return render(request, "index.html", context)


def create_book(request):
    if request.POST['title-html'] and request.POST['html-desc']:
        Book.objects.create(title=request.POST['title-html'], desc=request.POST['html-desc'])
    
    return redirect ("/")


def display_book(request,book_id):
    thisBook=Book.objects.get(id=book_id)
    assoc_author = thisBook.author.all()
    non_assoc_author = Author.objects.exclude(book=thisBook)
    context = {
        "thisBook": thisBook,
        "assoc_authors": assoc_author,
        "non_assoc_authors": non_assoc_author
    }
    return render(request, "display-books.html", context)

def add_author_to_book(request,book_id):
    if request.POST['html-author']:
        thisBook= Book.objects.get(id=book_id)
        thisAuthor=Author.objects.get(id=request.POST['html-author'])
        thisAuthor.book.add(thisBook)
    return redirect ("/books/{}".format(book_id))


def authors_page(request):
    context = {
        "all_the_authors": Author.objects.all(),
    }
    return render(request, "authors-page.html", context)


def create_author(request):
    if request.POST['first-name-html'] and request.POST['last-name-html'] and request.POST['html-notes']:
        Author.objects.create(first_name=request.POST['first-name-html'], last_name=request.POST['last-name-html'], notes=request.POST['html-notes'])
    
    return redirect ("/authors")


def display_author(request,author_id):
    thisAuthor=Author.objects.get(id=author_id)
    assoc_books=thisAuthor.book.all()
    non_assoc_books=Book.objects.exclude(author=thisAuthor)
    context = {
        "thisAuthor": thisAuthor,
        "assoc_books": assoc_books,
        "non_assoc_books": non_assoc_books
    }
    return render(request, "display-authors.html", context)



def add_book_to_author(request,author_id):
    if request.POST['html-book']:
        thisAuthor=Author.objects.get(id=author_id)
        thisBook=Book.objects.get(id=request.POST['html-book'])
        thisBook.author.add(thisAuthor)
    return redirect ("/authors/{}".format(author_id))