package com.blog.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.backend.model.EntriData;

@Repository
public interface PelatihanRepo extends JpaRepository<EntriData, Long> {
    
}
