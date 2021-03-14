package com.codingdojo.java.spring.languages.services;


import com.codingdojo.java.spring.languages.models.Language;
import com.codingdojo.java.spring.languages.repositories.LanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageService {
    // adding the book repository as a dependency
    private final LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    // returns all the languages
    public List<Language> allLanguages() {
        return languageRepository.findAll();
    }

    // creates a language
    public Language createLanguage(Language l) {
        return languageRepository.save(l);
    }

    // retrieves a language
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }

    //edits a language
    public Language updateLanguage(Long id, String name, String creator, String currentVersion) {
        Optional <Language> update = languageRepository.findById(id);
        if(update != null && update.isPresent()) {
            update.get().setName(name);
            update.get().setCreator(creator);
            update.get().setCurrentVersion(currentVersion);
            languageRepository.save(update.get());
            return update.get();
        }
        return null;
    }

    // deletes a language
    public void deleteLanguage(Long id) {
        languageRepository.deleteById(id);
    }
}
