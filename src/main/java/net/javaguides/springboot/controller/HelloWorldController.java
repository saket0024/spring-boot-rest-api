package net.javaguides.springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping(value = "/hello")
    public String helloWorld() {
        return "Hello-World";
    }

    @PostMapping("/delete")
    public String samplePostRequest(@RequestBody String name) {
        return "Hello " + name;
    }


}
