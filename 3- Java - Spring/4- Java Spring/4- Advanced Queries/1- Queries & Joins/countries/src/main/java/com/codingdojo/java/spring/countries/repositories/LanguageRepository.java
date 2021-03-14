package com.codingdojo.java.spring.countries.repositories;

import java.util.List;

import com.codingdojo.java.spring.countries.models.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LanguageRepository extends CrudRepository <Language, Long> {
    List <Language> findAll();
}
