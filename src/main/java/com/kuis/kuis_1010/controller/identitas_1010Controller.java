/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1010.controller;

import com.kuis.kuis_1010.entity.identitas_1010;
import com.kuis.kuis_1010.service.identitas_1010Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author PC-8-320
 */
@RestController
@RequestMapping("/identitas_1010")

    
 public class identitas_1010Controller {   
    @Autowired
    private identitas_1010Service identitas1010Service;

    @RequestMapping(method = RequestMethod.POST)
    public identitas_1010 insert(@RequestBody identitas_1010 identitas_1010) {
        return identitas1010Service.insert(identitas_1010);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public identitas_1010 update(@RequestBody identitas_1010 identitas_1010) {
        return identitas1010Service.update(identitas_1010);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitas1010Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public identitas_1010 getById(@PathVariable("id") Long id){
        return identitas1010Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<identitas_1010> getAll(){
        return identitas1010Service.getAll();
    }
}


