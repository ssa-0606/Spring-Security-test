package com.imikasa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mikasa
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test (){
        return "Hello World!!!";
    }

    @GetMapping("/index")
    public String index(){
        return "This is the index";
    }

    @GetMapping("/index1")
    public String index1(){
        return "This is the index1 ";
    }

}
