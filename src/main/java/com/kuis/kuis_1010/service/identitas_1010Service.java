/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1010.service;

import com.kuis.kuis_1010.entity.identitas_1010;
import com.kuis.kuis_1010.repo.identitas_1010Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-8-320
 */
@Service("identitas1010Service")
@Transactional
public class identitas_1010Service {

    @Autowired
    private identitas_1010Repo repo;

    public identitas_1010 insert(identitas_1010 identitas_1010) {
        return repo.save(identitas_1010);
    }
    
    public identitas_1010 update(identitas_1010 identitas_1010) {
        return repo.save(identitas_1010);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public identitas_1010 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<identitas_1010> getAll(){
        return repo.findAllidentitas_1010();
    }

   
}
