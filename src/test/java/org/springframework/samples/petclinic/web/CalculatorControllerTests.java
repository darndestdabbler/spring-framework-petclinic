package org.springframework.samples.petclinic.web;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringJUnitWebConfig(locations = {"classpath:spring/mvc-core-config.xml", "classpath:spring/mvc-test-config.xml"})
class CalculatorControllerTests {

    @Autowired
    private CalculatorController calculatorController;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(calculatorController).build();
    }

    @Test
    void testShowForm() throws Exception {
        mockMvc.perform(get("/calculator"))
            .andExpect(status().isOk())
            .andExpect(view().name("calculators/calculator"));
    }

    @Test
    void testCalculate() throws Exception {
        mockMvc.perform(post("/calculator").param("left", "2.5").param("right", "4"))
            .andExpect(status().isOk())
            .andExpect(model().attribute("sum", new BigDecimal("6.5")))
            .andExpect(model().attribute("difference", new BigDecimal("-1.5")))
            .andExpect(view().name("calculators/calculator"));
    }
}
