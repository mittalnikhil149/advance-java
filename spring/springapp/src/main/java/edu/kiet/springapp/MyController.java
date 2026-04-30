package edu.kiet.springapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/index")
    public String getInfo(){
        return "{message :Wlcome to sprint Boot REST API}";
    }
    @PostMapping("/index")
    public String addInfo(){
        return "{Message: Information inserted}";

    }
    
}
