/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1010.repo;

import com.kuis.kuis_1010.entity.identitas_1010;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC-8-320
 */
public interface identitas_1010Repo extends CrudRepository<identitas_1010, Long> {

    @Query("select i from identitas_1010 i")
    public List<identitas_1010> findAllidentitas_1010();
}
