from django.urls import path     
from . import views

urlpatterns = [
    path('', views.index),
    path('create-book', views.create_book),
    path('books/<book_id>', views.display_book),
    path('add-author-to-book/<book_id>', views.add_author_to_book),	 	
    path('authors', views.authors_page),   
    path('create-author', views.create_author),
    path('authors/<author_id>', views.display_author),
    path('add-book-to-author/<author_id>', views.add_book_to_author)
]