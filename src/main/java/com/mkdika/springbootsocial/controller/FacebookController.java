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
@RequestMapping({"social/facebook"})
public class FacebookController {

    @RequestMapping(method = GET)
    public ModelAndView getFacebookPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("social/facebook");
        return modelAndView;
    }
}
