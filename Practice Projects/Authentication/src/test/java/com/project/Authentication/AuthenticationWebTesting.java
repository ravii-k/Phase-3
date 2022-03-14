package com.project.Authentication;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class AuthenticationWebTesting {

	@Autowired
	private MockMvc mockMvc;
	
	@LocalServerPort
	private int port;
	
	@Test
	public void shouldGetDefaultMessageFromGreetings() throws Exception{
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	public void shouldGetDefaultMessageFromAuthenticate() throws Exception {
		this.mockMvc.perform(get("/Auth")).andDo(print()).andExpect(status().isOk());
	}
	
}
