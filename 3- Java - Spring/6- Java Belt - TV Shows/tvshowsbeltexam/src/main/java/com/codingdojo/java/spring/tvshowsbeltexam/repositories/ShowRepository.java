package com.codingdojo.java.spring.tvshowsbeltexam.repositories;


import com.codingdojo.java.spring.tvshowsbeltexam.models.Show;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShowRepository extends CrudRepository<Show, Long> {

}

