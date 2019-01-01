package com.example.demo.com.example.demo.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/testc/{id}")
    public String tests(@PathVariable String id){
        System.out.println(id);
        return id;
    }


}
