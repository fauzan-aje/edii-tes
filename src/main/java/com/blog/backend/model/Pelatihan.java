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
public class Pelatihan implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String namaKursus;
    private enum YaTidak{
        Ya,
        YaTidak
    }
    private YaTidak sertifikat;

    private String tahun;


    @JoinColumn(name = "biodataId", referencedColumnName = "id")
    @ManyToOne
    private EntriData entriData;
}
