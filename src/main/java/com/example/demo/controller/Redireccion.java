package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;


    @Controller
    @RequestMapping("/")
    public class Redireccion {
        @GetMapping("/")
        public RedirectView redirect(){
            return  new RedirectView("/inicio/");
        }
    }


