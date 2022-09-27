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
public class Pendidikan implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private enum JenjangPendidikan{
        SD,
        SMP,
        SMA,
        D3_Diploma,
        S1_Sarjana
    }
    private JenjangPendidikan jenjangPendidikan;

    private String namaInstitusi;
    private String jurusan;
    private String tahunLulus;
    private float ipk;

    @JoinColumn(name = "biodataId", referencedColumnName = "id")
    @ManyToOne
    private EntriData entriData;
}
