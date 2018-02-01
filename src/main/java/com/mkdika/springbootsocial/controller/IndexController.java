package com.mkdika.springbootsocial.controller;

import javax.inject.Inject;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@Controller
public class IndexController {
    
    private ConnectionRepository connectionRepository;

    @Inject
    public IndexController(ConnectionRepository connectionRepository) {        
        this.connectionRepository = connectionRepository;
    }
        
    @GetMapping("/")
    public ModelAndView getIndexPage() {
        ModelAndView modelAndView = new ModelAndView();   
        modelAndView.setViewName("index");
        return modelAndView;
    }         
}
