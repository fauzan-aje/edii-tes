package com.blog.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.backend.model.PengalamanKerja;

@Repository
public interface PengalamanKerjaRepo extends JpaRepository<PengalamanKerja, Long>{
    
}
