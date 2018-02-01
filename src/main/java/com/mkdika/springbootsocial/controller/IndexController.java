package com.mkdika.springbootsocial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@Controller
@RequestMapping({"", "/", "index"})
public class IndexController {
    
    @RequestMapping(method = GET)
    public ModelAndView getIndexPage() {
        ModelAndView modelAndView = new ModelAndView();   
        modelAndView.setViewName("index");
        return modelAndView;
    }    
}
