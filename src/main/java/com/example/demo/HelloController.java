package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("nome", "Mundo");   //manda pra nossa view
        return "hello";


   /* @GetMapping("/hello")
    public String hello(HttpServletRequest request){             //HttpserveletRequest utiliza a camada de serverless pra fazer isso
        request.setAttribute("nome","Mundo");                    //manda informaçoes para nossa view
        return "hello";
    }*/

    }
}
