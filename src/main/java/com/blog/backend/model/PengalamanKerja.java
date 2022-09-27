package com.blog.backend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class PengalamanKerja implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String namaPerusahaan;
    private String posisiTerakhir;
    private double pendapatanTerakhir;

    @JoinColumn(name = "biodataId", referencedColumnName = "id")
    @ManyToOne
    private EntriData entriData;
}
