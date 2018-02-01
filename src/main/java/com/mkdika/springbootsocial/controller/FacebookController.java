package com.mkdika.springbootsocial.controller;

import javax.inject.Inject;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String facebookController(Model model) {
        if (connectionRepository.findPrimaryConnection(Facebook.class) != null) {
            model.addAttribute("facebookProfile", facebook.userOperations().getUserProfile());
        }
        return "connect/facebookProfile";
    }

}
