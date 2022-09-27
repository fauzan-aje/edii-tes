package com.blog.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.backend.model.PengalamanKerja;
import com.blog.backend.repository.PengalamanKerjaRepo;

public class PengalamanKerjaService {
    
    @Autowired
    private PengalamanKerjaRepo pengalamanKerjaRepo;

    public PengalamanKerja save(PengalamanKerja pelatihan){
        return pengalamanKerjaRepo.save(pelatihan);
    }

    public PengalamanKerja findOne(Long id){
        Optional<PengalamanKerja> pelatihan = pengalamanKerjaRepo.findById(id);
        if(!pelatihan.isPresent()){
            return null;
        }
        return pelatihan.get();
    }

    public Iterable<PengalamanKerja> findAll(){
        return pengalamanKerjaRepo.findAll();
    }

    public void removeOne(Long id){
        pengalamanKerjaRepo.deleteById(id);
    }

    public List<PengalamanKerja> findByNama(String name){
        return pengalamanKerjaRepo.findByNamaPerusahaanContains(name);
    }
}
