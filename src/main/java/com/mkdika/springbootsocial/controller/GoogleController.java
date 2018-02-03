package com.mkdika.springbootsocial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@Controller
public class GoogleController {

    @GetMapping("connect/google")
    public ModelAndView getGooglePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("connect/google");
        return modelAndView;
    }
}
