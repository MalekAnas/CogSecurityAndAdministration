package se.sigma.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class MainController {



    @GetMapping("/index")
    @ResponseBody
    public String getUser(){
        return "Hello world!";
    }
}
