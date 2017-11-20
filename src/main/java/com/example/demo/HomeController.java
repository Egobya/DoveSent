package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController
{

@GetMapping("/customerform")
public String LoadFormPage(Model model)
{
    model.addAttribute("customer", new Customer());
    return "customerform";
}
    public String LoadFormPage(@ModelAttribute Customer customer, Model model){
        model.addAttribute("customer", new Customer());
        return "confirmcustomer";
    }
}
}
