package com.bilisimio.movieservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class HomeController {

    Logger logger = Logger.getLogger(HomeController.class.getName());

    @Autowired
    private Environment environment;

    @GetMapping(value = "/home")
    public String home() {
        logger.info("Serving request from " + environment.getProperty("HOSTNAME"));
        return "Hello World! " + environment.getProperty("HOSTNAME");
    }
}
