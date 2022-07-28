package com.habityouheard.habityouheard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
public class HelloController {

    @GetMapping
    @ResponseBody
    public String hell() {
        return "Hello Spring";
    }
}
