package com.blog.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.backend.model.Pelatihan;

@Repository
public interface PelatihanRepo extends JpaRepository<Pelatihan, Long> {
    List<Pelatihan> findByNamaKursusContains(String nama);
}
