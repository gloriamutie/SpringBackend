package com.Gloria.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/hello")
    public String sayHelloWorld(){
      return "Hello World!";
  }

}
