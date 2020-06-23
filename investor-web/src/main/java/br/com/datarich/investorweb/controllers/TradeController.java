package br.com.datarich.investorweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trades")
public class TradeController {

    @RequestMapping({"", "/", "/index.html"})
    public String index(){ return "trades/index";}
}
