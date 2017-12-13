/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1010.controller;

import com.kuis.kuis_1010.entity.ipk_1010;
import com.kuis.kuis_1010.entity.ipk_1010;
import com.kuis.kuis_1010.service.ipk_1010Service;
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
@RequestMapping("/ipk_1010")

    
 public class ipk_1010Controller {   
    @Autowired
    private ipk_1010Service ipk1010Service;

    @RequestMapping(method = RequestMethod.POST)
    public ipk_1010 insert(@RequestBody ipk_1010 ipk_1010) {
        return ipk1010Service.insert(ipk_1010);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ipk_1010 update(@RequestBody ipk_1010 ipk_1010) {
        return ipk1010Service.update(ipk_1010);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipk1010Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ipk_1010 getById(@PathVariable("id") Long id){
        return ipk1010Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<ipk_1010> getAll(){
        return ipk1010Service.getAll();
    }
}


