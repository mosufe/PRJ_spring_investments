package br.com.datarich.investor.controllers;

import br.com.datarich.investor.repositories.HistoricalDataRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/historical-data")
public class HistoricalDataController {

    private final HistoricalDataRepository historicalDataRepository;

    public HistoricalDataController(HistoricalDataRepository historicalDataRepository) {
        this.historicalDataRepository = historicalDataRepository;
    }

    @RequestMapping({"","/", "/index.html"})
    public String index(Model model){
        model.addAttribute("historicals", historicalDataRepository.findAll());
        return "historical-data/index";
    }
}
