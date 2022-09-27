package com.blog.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.backend.model.EntriData;
import com.blog.backend.model.Pelatihan;
import com.blog.backend.model.Pendidikan;
import com.blog.backend.model.PengalamanKerja;
import com.blog.backend.repository.EntriDataRepo;

@Service
public class EntriDataService {
    @Autowired
    EntriDataRepo entriDataRepo;

    public EntriData save(EntriData entriData, Pendidikan pendidikan, Pelatihan pelatihan, PengalamanKerja pengalamanKerja){
        return entriDataRepo.save(entriData);
    }

    public EntriData findOne(Long id){
        Optional<EntriData> entriData = entriDataRepo.findById(id);
        if(!entriData.isPresent()){
            return null;
        }
        return entriData.get();
    }

    public Iterable<EntriData> findAll(){
        return entriDataRepo.findAll();
    }

    public void removeOne(Long id){
        entriDataRepo.deleteById(id);
    }

    public List<EntriData> findByNama(String name){
        return entriDataRepo.findByNamaContains(name);
    }

    
}
