package br.com.datarich.investorweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/companies")
public class CompanyController {

    @RequestMapping({"", "/", "/index.html"})
    public String index(){ return "companies/index";}
}
