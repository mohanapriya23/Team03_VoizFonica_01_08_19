package com.example.voizfonica.controller;

import com.example.voizfonica.data.RegisterRepository;
import com.example.voizfonica.model.Login;
import com.example.voizfonica.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {
    private RegisterRepository registerrepo;
    @Autowired
    private LoginController(RegisterRepository registerrepo)
    {
        this.registerrepo=registerrepo;
    }
    @GetMapping
    public String login(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }

    @PostMapping
    public String user1(@Valid Login login, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "login";
        } else {
            List<Register> register = registerrepo.findByEmailAndAndPassword(login.getEmail(), login.getPassword());
            if (register.isEmpty()) {
                return "redirect:/login";
            } else {
                model.addAttribute("register", register);
                return "redirect:/dashboard";
            }
        }
    }}