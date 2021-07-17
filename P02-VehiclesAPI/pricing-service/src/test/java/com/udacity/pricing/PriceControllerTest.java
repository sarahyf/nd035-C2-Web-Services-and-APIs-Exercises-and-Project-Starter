package com.udacity.pricing;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
public class PriceControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getPrice() throws Exception {
    // MvcResult result = 
    mockMvc.perform(get(new URI("/services/price?vehicleId=" + 1)))
    .andExpect(status().isOk());
    // .andReturn();
    // verify(pricingService).getPrice(1);

    }
}
