package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjiameng
 * @Description:
 * @date 2020-03-20 9:10
 */
@RestController
public class Say {

    @GetMapping("/say")
    public String say(){
        return "hello word!";
    }

}
