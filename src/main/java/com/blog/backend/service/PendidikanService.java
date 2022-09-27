package com.blog.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.backend.model.Pendidikan;
import com.blog.backend.repository.PendidikanRepo;

@Service
public class PendidikanService {
    
    @Autowired
    private PendidikanRepo pendidikanRepo;

    public Pendidikan save(Pendidikan pendidikan){
        return pendidikanRepo.save(pendidikan);
    }

    public Pendidikan findOne(Long id){
        Optional<Pendidikan> pendidikan = pendidikanRepo.findById(id);
        if(!pendidikan.isPresent()){
            return null;
        }
        return pendidikan.get();
    }

    public Iterable<Pendidikan> findAll(){
        return pendidikanRepo.findAll();
    }

    public void removeOne(Long id){
        pendidikanRepo.deleteById(id);
    }

    public List<Pendidikan> findByNama(String name){
        return pendidikanRepo.findByNamaContains(name);
    }
}
