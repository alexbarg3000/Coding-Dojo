package com.codingdojo.java.spring.lookify.repositories;

import com.codingdojo.java.spring.lookify.models.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {
    // this method retrieves all the languages from the database
    List<Song> findAll();
    //    // this method finds books with descriptions containing the search string
//    List<Song> findByDescriptionContaining(String search);
//    // this method counts how many titles contain a certain string
//    Long countByTitleContaining(String search);
//    // this method deletes a language that starts with a specific title
//    Long deleteByTitleStartingWith(String search);
    // this method finds a language by id
    Optional<Song> findById(Long id);
    // this method deletes a language by id
    void deleteById(Long id);
    // this method finds a song by artist
    List<Song> findByArtist(String artist);
    // this method finds a rop  10 songs order by rating
    List<Song> findTop10ByOrderByRatingDesc();

}
