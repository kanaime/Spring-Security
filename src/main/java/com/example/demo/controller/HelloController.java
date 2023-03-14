package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String champion() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String director() {
        return "biarritz, bordeaux, la Loupe, lille, lyon, nantes, orléans, paris, reims, strasbourg, toulouse, amsterdam, barcelone, berlin, lisbonne, madrid";
    }
}