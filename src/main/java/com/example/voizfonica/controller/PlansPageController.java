package com.example.voizfonica.controller;
import com.example.voizfonica.model.PlansPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/planspage")
public class PlansPageController {

    @GetMapping
    public String showPayment(Model model){
        model.addAttribute("plans",new PlansPage());
        return "planspage";
    }
}
