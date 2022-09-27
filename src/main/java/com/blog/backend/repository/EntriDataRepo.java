package com.blog.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.backend.model.EntriData;

@Repository
public interface EntriDataRepo extends JpaRepository<EntriData, Long> {
    List<EntriData> findByNamaContains(String nama);
}
