/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1010.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author PC-8-320
 */
 @Entity
@Table(name = "identitas_1010")
public class identitas_1010 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mahasiswa;
    @Column(length = 100, nullable = false, unique = true)
    private String nama_mahasiswa;
    @Column(length = 100, nullable = true)
    private String prodi;
    @Column(length = 100, nullable = true)
    private String tahunmasuk;

    public Long getId_Mahasiswa() {
        return id_mahasiswa;
    }

    public void setId_Mahasiswa(Long id_mahasiswa) {
        this.id_mahasiswa = id_mahasiswa;
    }

    
    
    
    /**
     * @return the name
     */
    public String getNama_Mahasiswa() {
        return nama_mahasiswa;
    }

    /**
     * @param nama_mahasiswa the name to set
     */
    public void setNama_Mahasiswa(String nama_mahasiswa) {
        this.nama_mahasiswa = nama_mahasiswa;
    }

    
    
    
    /**
     * @return the description
     */
    public String getProdi() {
        return prodi;
    }
    /**
     * @param prodi the description to set
     */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    

    
    
    public String getTahunMasuk() {
        return tahunmasuk;
    }
    /**
     * @param tahunmasuk the description to set
     */
    public void setTahunMasuk(String tahunmasuk) {
        this.tahunmasuk = tahunmasuk;
    }


}


