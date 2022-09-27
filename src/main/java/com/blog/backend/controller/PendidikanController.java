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

import com.blog.backend.model.Pendidikan;
import com.blog.backend.service.PendidikanService;

@RestController
@RequestMapping("/api/pendidikan")
public class PendidikanController {
    
    @Autowired
    private PendidikanService pendidikanService;

    @PostMapping
    public Pendidikan create(@RequestBody Pendidikan pendidikan){
        return pendidikanService.save(pendidikan);
    }

    @GetMapping
    public Iterable<Pendidikan> findAll(){
        return pendidikanService.findAll();
    }

    @GetMapping("/{id}")
    public Pendidikan findOne(@PathVariable("id") Long id){
        return pendidikanService.findOne(id);
    }

    @PutMapping
    public Pendidikan update(@RequestBody Pendidikan produk){
        return pendidikanService.save(produk); 
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id){
        pendidikanService.removeOne(id);
    }
}
