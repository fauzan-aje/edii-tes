package com.blog.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.backend.model.Pendidikan;

@Repository
public interface PendidikanRepo extends JpaRepository<Pendidikan, Long> {
    List<Pendidikan> findByNamaInstitusiContains(String nama);
}
