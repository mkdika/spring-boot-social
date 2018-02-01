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
@RequestMapping({"social/google"})
public class GoogleController {

    @RequestMapping(method = GET)
    public ModelAndView getGooglePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("social/google");
        return modelAndView;
    }
}