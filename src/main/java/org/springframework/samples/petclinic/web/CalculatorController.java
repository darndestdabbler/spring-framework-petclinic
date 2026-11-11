package org.springframework.samples.petclinic.web;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The calculator page at {@code /calculator}: a form for two numbers, and their sum and
 * difference once it is posted.
 */
@Controller
public class CalculatorController {

    private static final String VIEW = "calculators/calculator";

    private final Calculator calculator = new Calculator();

    /**
     * Shows the calculator form with no result.
     *
     * @return the calculator view
     */
    @GetMapping("/calculator")
    public String showForm() {
        return VIEW;
    }

    /**
     * Shows the sum and the difference of the two numbers posted.
     *
     * @param left the first number
     * @param right the second number
     * @param model receives both numbers, {@code sum} and {@code difference}
     * @return the calculator view
     */
    @PostMapping("/calculator")
    public String calculate(@RequestParam BigDecimal left, @RequestParam BigDecimal right, Model model) {
        model.addAttribute("left", left);
        model.addAttribute("right", right);
        model.addAttribute("sum", calculator.add(left, right));
        model.addAttribute("difference", calculator.subtract(left, right));
        return VIEW;
    }
}
