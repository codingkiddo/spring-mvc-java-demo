package com.baeldung.spring.configuration.secure.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import javax.servlet.ServletContext;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.baeldung.spring.configuration.NormalWebAppConfig;
import com.baeldung.spring.configuration.RootApplicationConfig;
import com.baeldung.spring.configuration.normal.controller.NormalHelloWorldController;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {RootApplicationConfig.class, NormalWebAppConfig.class})
@WebAppConfiguration
public class SecureHelloWorldControllerTest {

	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	
	@BeforeEach
	public void set_up() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
	}
	
	@Test
	public void given_wac_when_servlet_context_then_it_provide_normal_hello_world_controller() {
		final ServletContext servletContext = webApplicationContext.getServletContext();
		assertNotNull(servletContext);
		assertTrue(servletContext instanceof ServletContext);
		assertNotNull(webApplicationContext.getBean(NormalHelloWorldController.class));
	}
	
	@Test
	public void given_hello_uri_when_mock_mvc_then_returns_welcome_html_view_name() throws Exception {
		final ModelAndView modelAndView = this.mockMvc.perform(MockMvcRequestBuilders.get("/normal/hello")).andReturn().getModelAndView();
		assertNotNull(modelAndView);
		assertSame(modelAndView.getViewName(), "welcome.html");
	}
}
