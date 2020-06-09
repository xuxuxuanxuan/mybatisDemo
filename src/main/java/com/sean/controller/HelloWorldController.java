package com.sean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: sean.xu
 * @Date: 2020/5/19
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public void hello(){
        System.out.println("Hello World");
    }
}
