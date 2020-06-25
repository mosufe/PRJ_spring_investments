package br.com.datarich.investor.controllers;

import br.com.datarich.investor.repositories.TradeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trades")
public class TradeController {

    private final TradeRepository tradeRepository;

    public TradeController(TradeRepository tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    @RequestMapping({"", "/", "/index.html"})
    public String index(Model model){
        model.addAttribute("trades", tradeRepository.findAll());
        return "trades/index";
    }
}
