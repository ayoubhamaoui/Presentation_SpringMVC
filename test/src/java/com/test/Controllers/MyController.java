/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ayoub
 */

@Controller
public class MyController {
    
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "HELLO GINF";
    }
    
}
