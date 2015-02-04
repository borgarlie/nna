/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bgames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Borgar
 */


// put requestmapping here -> use get , post etc for the methods-- use many classes!
@Controller
public class MainController {
    
    @RequestMapping(value = "*")
    public String any_page() {
        return "index"; 
    }
    
}
