package br.com.datarich.investorweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/historical-data")
public class HistoricalDataController {

    @RequestMapping({"","/", "/index.html"})
    public String index(){
        return "historical-data/index";
    }
}
