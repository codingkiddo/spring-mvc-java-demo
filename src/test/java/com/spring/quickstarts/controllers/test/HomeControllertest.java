package com.spring.quickstarts.controllers.test;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.spring.quickstarts.controllers.HomeController;

public class HomeControllertest {

	@Test
	public void test_home_page() throws Exception {
		HomeController controller = new HomeController();
		assertEquals("home", controller.getHome());
	}
	
	@Test
	public void test_home_page_mvc() throws Exception {
		HomeController controller = new HomeController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		mockMvc.perform(get("/")).andExpect(view().name("home"));
	}
}
