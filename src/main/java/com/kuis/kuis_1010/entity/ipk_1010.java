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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PC-8-320
 */
 @Entity
@Table(name = "ipk_1010")
public class ipk_1010 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_matkul;
    @Column(length = 100, nullable = false, unique = true)
    private String id_mahasiswa;
    @Column(length = 100, nullable = true)
    private String semester;
    @Column(length = 100, nullable = true)
    private String ipk;
    

    
     @ManyToOne
    private identitas_1010 identitas_1010;

    /**
     * @return the id_matkul
     */
    public Long getId_matkul() {
        return id_matkul;
    }

    /**
     * @param id_matkul the id_matkul to set
     */
    public void setId_matkul(Long id_matkul) {
        this.id_matkul = id_matkul;
    }

    /**
     * @return the id_mahasiswa
     */
    public String getId_mahasiswa() {
        return id_mahasiswa;
    }

    /**
     * @param id_mahasiswa the id_mahasiswa to set
     */
    public void setId_mahasiswa(String id_mahasiswa) {
        this.id_mahasiswa = id_mahasiswa;
    }

    /**
     * @return the semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * @return the ipk
     */
    public String getIpk() {
        return ipk;
    }

    /**
     * @param ipk the ipk to set
     */
    public void setIpk(String ipk) {
        this.ipk = ipk;
    }

    /**
     * @return the identitas_1010
     */
    public identitas_1010 getIdentitas_1010() {
        return identitas_1010;
    }

    /**
     * @param identitas_1010 the identitas_1010 to set
     */
    public void setIdentitas_1010(identitas_1010 identitas_1010) {
        this.identitas_1010 = identitas_1010;
    }

    
   

}


