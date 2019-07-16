package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLOutput;

@Controller
public class UserController {

        @RequestMapping(value = "/")
        public ModelAndView hello() {
            User user = new User("Matt");

            ModelAndView modelView = new ModelAndView("index");
            modelView.addObject("userName", user.getUserName());
            return modelView;

    }


}
