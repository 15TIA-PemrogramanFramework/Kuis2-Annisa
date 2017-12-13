/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1010.repo;


import com.kuis.kuis_1010.entity.ipk_1010;
import com.kuis.kuis_1010.entity.ipk_1010;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC-8-320
 */
public interface ipk_1010Repo extends CrudRepository<ipk_1010, Long> {

    @Query("select ip from ipk_1010 ip")
    public List<ipk_1010> findAllipk_1010();

}