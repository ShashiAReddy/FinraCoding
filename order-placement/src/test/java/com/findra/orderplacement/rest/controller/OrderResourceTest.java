package com.findra.orderplacement.rest.controller;

import javax.annotation.PostConstruct;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.findra.orderplacement.repository.OrderRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@EnableJpaRepositories
@ComponentScan("com.findra.orderplacement")
@ContextConfiguration(classes= {OrderResourceTest.class})
@WebAppConfiguration
public class OrderResourceTest {

	@Autowired
	OrderResource orderResource;
	
	@Autowired
	OrderRepository orderRepository;
	
	MockMvc mockMvc;
	
	@PostConstruct
	public void setup() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(orderResource).build();
	}
	
	@Test
	public void submitOrderTest() {
		//TODO:
		//do the test for post method in the order submission
		//use inmemory database
		//use mock email
		//use mock payment service
	}
	
	

}
