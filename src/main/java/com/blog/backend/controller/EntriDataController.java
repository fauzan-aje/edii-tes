package com.blog.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.backend.model.EntriData;
import com.blog.backend.model.Pelatihan;
import com.blog.backend.model.Pendidikan;
import com.blog.backend.model.PengalamanKerja;
import com.blog.backend.service.EntriDataService;

@RestController
@RequestMapping("/api/biodata")
public class EntriDataController {
    
    @Autowired
    private EntriDataService entriDataService;

    @PostMapping
    public EntriData create(@RequestBody EntriData entriData, Pendidikan pendidikan,Pelatihan pelatihan, 
    PengalamanKerja pengalamanKerja){
        return entriDataService.save(entriData, pendidikan,pelatihan, pengalamanKerja); 
    }

    @GetMapping
    public Iterable<EntriData> findAll(){
        return entriDataService.findAll();
    }

    @GetMapping("/{id}")
    public EntriData findOne(@PathVariable("id") Long id){
        return entriDataService.findOne(id);
    }

    @PutMapping
    public EntriData update(@RequestBody EntriData entriData, Pendidikan pendidikan,Pelatihan pelatihan, 
    PengalamanKerja pengalamanKerja){
        return entriDataService.save(entriData, pendidikan,pelatihan, pengalamanKerja); 
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id){
        entriDataService.removeOne(id);
    }
}
