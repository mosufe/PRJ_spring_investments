package br.com.datarich.investor.controllers;

import br.com.datarich.investor.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String index(Model model)
    {
        model.addAttribute("users", userRepository.findAll());
        return "users/index";
    }
}
