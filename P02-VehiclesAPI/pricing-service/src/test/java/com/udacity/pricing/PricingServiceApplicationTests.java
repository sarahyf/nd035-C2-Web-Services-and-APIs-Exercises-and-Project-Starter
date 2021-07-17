package com.udacity.pricing;


// import org.junit.jupiter.api.Test;

// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.udacity.pricing.api.PricingController;
// import com.udacity.pricing.service.PricingService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@SpringBootTest
// @RunWith(SpringRunner.class)
// @WebMvcTest(PricingController.class)
// @AutoConfigureMockMvc
// @AutoConfigureJsonTesters
public class PricingServiceApplicationTests {

	// @Autowired
	// private MockMvc mockMvc;
	// @MockBean
	// PricingService pricingService;

	@Test
	public void contextLoads() {
	}

	// @Test
	// public void getPrice() throws Exception {
	// 	MvcResult result = mockMvc.perform(get("/services/price?vehicleId=" + 1))
	// 			.andExpect(status().isOk()).andReturn();
	// 	// verify(pricingService).getPrice(1);

	// }


}
