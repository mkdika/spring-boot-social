package com.mkdika.springbootsocial.controller;

import java.util.Base64;
import javax.inject.Inject;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@Controller
public class FacebookController {

    private Facebook facebook;
    private ConnectionRepository connectionRepository;

    @Inject
    public FacebookController(Facebook facebook, ConnectionRepository connectionRepository) {
        this.facebook = facebook;
        this.connectionRepository = connectionRepository;
    }

    @GetMapping("/facebook")
    public ModelAndView facebookController() {
        ModelAndView model = new ModelAndView();
        if (connectionRepository.findPrimaryConnection(Facebook.class) != null) {            
            model.addObject("pic",Base64.getEncoder().encodeToString(facebook.userOperations().getUserProfileImage()));
            model.addObject("facebookProfile", facebook.userOperations().getUserProfile());            
        }
        model.setViewName("connect/facebookProfile");
        return model;
    }

}
