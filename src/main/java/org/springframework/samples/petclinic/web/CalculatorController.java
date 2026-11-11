package org.springframework.samples.petclinic.web;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    private static final String VIEW = "calculators/calculator";

    private final Calculator calculator = new Calculator();

    @GetMapping("/calculator")
    public String showForm() {
        return VIEW;
    }

    @PostMapping("/calculator")
    public String calculate(@RequestParam BigDecimal left, @RequestParam BigDecimal right, Model model) {
        model.addAttribute("left", left);
        model.addAttribute("right", right);
        model.addAttribute("sum", calculator.add(left, right));
        model.addAttribute("difference", calculator.subtract(left, right));
        return VIEW;
    }
}
