package com.blog.backend.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;

import lombok.Data;

@Entity
@Data
public class EntriData implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String posisiDiLamar;
    private String nama;
    private int noKTP;
    private Date tTL;
    private String jk;
    private String agama;
    private String golDarah;

    public enum Status {
        Menikah,
        Belum,
        Diforce
    }
    
    @Column(name = "STATUS", nullable = true)
    @Enumerated(EnumType.STRING)
    private Status status ;

    private String alamatKTP;
    private String alamatTinggal;

    @Email
    private String email;

    private int noHP;
    private int hpOrangterdekat;

    private String skill;

    private enum YaTidak{
        Ya,
        YaTidak
    }
    private YaTidak penempatan;

    private double penghasilanYgDiharap;

    private Date createDate;

    
}
