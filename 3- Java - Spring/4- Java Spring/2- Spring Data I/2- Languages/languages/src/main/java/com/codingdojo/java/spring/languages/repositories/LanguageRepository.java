package com.codingdojo.java.spring.languages.repositories;

import com.codingdojo.java.spring.languages.models.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
    // this method retrieves all the languages from the database
    List<Language> findAll();
//    // this method finds books with descriptions containing the search string
//    List<Language> findByDescriptionContaining(String search);
//    // this method counts how many titles contain a certain string
//    Long countByTitleContaining(String search);
//    // this method deletes a language that starts with a specific title
//    Long deleteByTitleStartingWith(String search);
    // this method finds a language by id
    Optional<Language> findById(Long id);
    // this method deletes a language by id
    void deleteById(Long id);
}
