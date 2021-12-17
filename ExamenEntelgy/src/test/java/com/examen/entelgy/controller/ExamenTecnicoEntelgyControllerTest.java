/**
 * 
 */
package com.examen.entelgy.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import com.examen.entelgy.entities.produces.UserProduces;
import com.examen.entelgy.repository.Impl.ExamenTecnicoEntelgyInterfaceImpl;
import com.examen.entelgy.service.impl.ExamenTecnicoEntelgyServiceImpl;
import com.examen.entelgy.util.response.ProducesResponse;

/**
 * @author ricm2608
 *
 */
@WebMvcTest(controllers = {ExamenTecnicoEntelgyController.class})
class ExamenTecnicoEntelgyControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	ExamenTecnicoEntelgyInterfaceImpl repository;
	
	@MockBean
	ExamenTecnicoEntelgyServiceImpl services;
	
	@MockBean
	RestTemplate restTemplate;
	
	ProducesResponse producesResponse;
	
	List<UserProduces> listaUsuarios;
	
	@Value("${api.examen.tecnico.entelgy.url}")
	String url;
	
	@BeforeEach
	void setUp() throws Exception {
		producesResponse = new ProducesResponse();
		listaUsuarios = new ArrayList<>();
		listaUsuarios.add(new UserProduces(1,"Cabrera","rogercabrera2608@gmail.com"));
		listaUsuarios.add(new UserProduces(2,"Muñoz","israelmunoz2608@gmail.com"));
		
		producesResponse.setData(listaUsuarios);
	}
	
	@Test
	void testGetApi() throws Exception {
		Mockito.when(services.responseMyApiRest(restTemplate, url)).thenReturn(producesResponse);
		
		String apiUrl = "/data/users";
		
		mockMvc.perform(post(apiUrl)).andExpect(status().isOk());
		
	}

}
