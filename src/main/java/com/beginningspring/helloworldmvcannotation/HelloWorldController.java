/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beginningspring.helloworldmvcannotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author javaBrat
 */
@Controller
public class HelloWorldController {
    @RequestMapping(value = "/world")
    public ModelAndView greet(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "Hello annotations world!");
        mav.setViewName("helloWorld");
        return mav;
    }
    
    
}
