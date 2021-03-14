package com.codingdojo.java.spring.dojosandninjas.services;

import com.codingdojo.java.spring.dojosandninjas.models.Dojo;
import com.codingdojo.java.spring.dojosandninjas.models.Ninja;
import com.codingdojo.java.spring.dojosandninjas.repositories.DojoRepository;
import com.codingdojo.java.spring.dojosandninjas.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoNinjaService {
    private final DojoRepository dojoRepository;
    private final NinjaRepository ninjaRepository;

    public DojoNinjaService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
        this.dojoRepository = dojoRepository;
        this.ninjaRepository = ninjaRepository;
    }

    public void addDojo(Dojo dojo) {
        dojoRepository.save(dojo);
    }

    //get list of all dojos
    public List<Dojo> getAllDojos() {
        return dojoRepository.findAll();
    }

    public List<Ninja> getAllNinjas() {
        return ninjaRepository.findAll();
    }


    public Dojo singleDojo(Long id) {
        Optional<Dojo> dojo = dojoRepository.findById(id);
        if(dojo.isPresent()) {
            return dojo.get();
        }
        else {
            return null;
        }
    }

    public void addNinja(Ninja ninja) {
        ninjaRepository.save(ninja);
    }
}
