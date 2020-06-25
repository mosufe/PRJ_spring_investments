package br.com.datarich.investor.controllers;

import br.com.datarich.investor.repositories.CompanyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyRepository companyRepository;

    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @RequestMapping({"", "/", "/index.html"})
    public String index(Model model){
        model.addAttribute("companies", companyRepository.findAll());
        return "companies/index";
    }
}
