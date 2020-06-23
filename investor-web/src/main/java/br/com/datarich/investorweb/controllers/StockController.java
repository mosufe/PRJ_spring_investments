package br.com.datarich.investorweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stocks")
public class StockController {

    @RequestMapping({"", "/", "/index.html"})
    public String index(){ return "stocks/index";}
}
