package com.blog.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.backend.model.Pelatihan;
import com.blog.backend.repository.PelatihanRepo;

@Service
public class PelatihanService {
    @Autowired
    private PelatihanRepo pelatihanRepo;

    public Pelatihan save(Pelatihan pelatihan){
        return pelatihanRepo.save(pelatihan);
    }

    public Pelatihan findOne(Long id){
        Optional<Pelatihan> pelatihan = pelatihanRepo.findById(id);
        if(!pelatihan.isPresent()){
            return null;
        }
        return pelatihan.get();
    }

    public Iterable<Pelatihan> findAll(){
        return pelatihanRepo.findAll();
    }

    public void removeOne(Long id){
        pelatihanRepo.deleteById(id);
    }

    public List<Pelatihan> findByNama(String name){
        return pelatihanRepo.findByNamaContains(name);
    }
}
