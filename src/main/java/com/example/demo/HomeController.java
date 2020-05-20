package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/homepage")
    public String loadhome(Model model) {
        model.addAttribute("carBean", new CarBean());

        return "homepage";
    }

    @RequestMapping("/confirmationpage")
    public String loadconfirmationpage(@ModelAttribute CarBean carBean, Model model) {
        model.addAttribute("carBean", carBean);
    return "confirmationpage";
}
}