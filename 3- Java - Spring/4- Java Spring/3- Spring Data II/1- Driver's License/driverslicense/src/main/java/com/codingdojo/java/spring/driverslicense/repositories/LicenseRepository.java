package com.codingdojo.java.spring.driverslicense.repositories;

import com.codingdojo.java.spring.driverslicense.models.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {
/*
    // this method retrieves all the languages from the database
    List<License> findAll();
    //    // this method finds books with descriptions containing the search string
//    List<Song> findByDescriptionContaining(String search);
//    // this method counts how many titles contain a certain string
//    Long countByTitleContaining(String search);
//    // this method deletes a language that starts with a specific title
//    Long deleteByTitleStartingWith(String search);
    // this method finds a language by id
    Optional<License> findById(Long id);
    // this method deletes a language by id
    void deleteById(Long id);
    // this method finds a song by artist
    List<License> findByArtist(String artist);
    // this method finds a rop  10 songs order by rating
    List<Song> findTop10ByOrderByRatingDesc();
*/
List<License> findTopByOrderByNumberDesc();

}
