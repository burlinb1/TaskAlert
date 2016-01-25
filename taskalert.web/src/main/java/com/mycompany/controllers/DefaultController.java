/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
//import com.mycompany.objectmodel.Person;
//import com.mycompany.objectmodel.Address;
//import com.google.gson.Gson;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.sql.*;

/**
 *
 * @author Brianb
 */
@Controller
public class DefaultController {   
    
    @RequestMapping( value="/", method = RequestMethod.GET)
    public String index(ModelMap map){                
        
//        try {
//            List<Person> list = new ArrayList<>();
//
//            Person person = new Person();
//            person.setFirstName("Madeline");
//            person.setLastName("B");
//
//            Address addr = new Address();
//            addr.setStreetName("Hollywood Blvd");
//            person.setAddress(addr);
//
//            list.add(person);
//
//            person = new Person();
//            person.setFirstName("Jill");
//            person.setLastName("B");
//
//            addr = new Address();
//            addr.setStreetName("Madison Ave");
//            person.setAddress(addr);
//
//            list.add(person);
//
//            ObjectMapper mapper = new ObjectMapper();
//            String json;
//            json = mapper.writeValueAsString(list);
//            map.put("msg1", json);
//            
//            try
//            {
//                Class.forName("org.postgresql.Driver");
//                Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Rate", "postgres", PW);
//            }
//            catch(ClassNotFoundException | SQLException e)
//            {
//                
//            }
//            
//        } catch (JsonProcessingException ex) {
//            Logger.getLogger(DefaultController.class.getName()).log(Level.SEVERE, null, ex);
//        }
       
        ObjectMapper mapper = new ObjectMapper();
        //String json;
        //json = mapper.writeValueAsString(list);
        map.put("msg1", "test message 1");
        map.put("msg2", "test message 2");

        return "index";
    }
}
