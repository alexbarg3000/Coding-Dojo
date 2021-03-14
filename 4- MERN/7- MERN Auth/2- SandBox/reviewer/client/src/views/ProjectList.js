import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { navigate, Link } from '@reach/router';


export default function ProjectList(props) {
    const{id,user}=props
    const [books, setBooks] = useState([]);
    const [hasError, setHasError] = useState(false);
    const [favoriteBooks, setFavoriteBooks] = useState([]);

    console.log(id)

    const handleAdd = (id,book) => {
        axios.put('http://localhost:8000/api/user/edit/' +id,{favorite_book:book})
            .then(res => {
                if(res.data.results) {
                    navigate('/')
                }
            })
            .catch(err => console.log(err))
    }


    useEffect(() => {
        axios.get('http://localhost:8000/api/project')
            .then(response => setBooks(response.data))
            // .catch(() => setHasError(true));
            .catch(err => console.log(err))
        // .catch(console.log);
    }, []);

    useEffect(() => {
        axios.get('http://localhost:8000/api/user/'+id)
            .then(response => setFavoriteBooks(response.data.favorite_book))
            // .catch(() => setHasError(true));
            .catch(err => console.log(err))
        // .catch(console.log);
    }, []);



    if(hasError) return 'Something went wrong!';

    console.log(favoriteBooks)

    return (
        <div className={"container jumbotron"} style={{padding:"50px"}}>
            <div className={"col-12"}>
                <div className={"row"}>
                    <div className={"col-6"}>
                        <h1>List of all Books</h1>
                        <br />
                            {books.map(book => (
                                <ul key={book._id} >
                                    <li>
                                        <h3>{book.name} <button className="btn btn-success" onClick={e => { handleAdd(user._id,book.name) }}>  {book.name}</button>
                                        </h3>
                                    </li>
                                </ul>
                            ))}

                    </div>
                    <div className={"col-6"}>
                        <h1>My Favorite books</h1>
                        <br />
                        {user.favorite_book}
                        {favoriteBooks.map(book => (
                            <ul key={book._id} >
                                <li>
                                    <h3>{book.favorite_book}</h3>
                                </li>
                            </ul>
                        ))}
                    </div>
                </div>


            </div>
        </div>
    )
}