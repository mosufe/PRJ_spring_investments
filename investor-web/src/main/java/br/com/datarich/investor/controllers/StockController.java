package br.com.datarich.investor.controllers;

import br.com.datarich.investor.repositories.StockRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stocks")
public class StockController {

    private final StockRepository stockRepository;

    public StockController(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @RequestMapping({"", "/", "/index.html"})
    public String index(Model model){
        model.addAttribute("stocks", stockRepository.findAll());
        return "stocks/index";
    }
}
