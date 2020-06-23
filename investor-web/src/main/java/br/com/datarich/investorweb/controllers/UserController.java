package br.com.datarich.investorweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @RequestMapping({"", "/", "/index"})
    public String index(){
        return "users/index";
    }
}
