package com.examen.entelgy.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.examen.entelgy.entities.consumer.SupportConsumer;
import com.examen.entelgy.entities.consumer.UserConsumer;
import com.examen.entelgy.entities.produces.UserProduces;
import com.examen.entelgy.repository.Impl.ExamenTecnicoEntelgyInterfaceImpl;
import com.examen.entelgy.service.impl.ExamenTecnicoEntelgyServiceImpl;
import com.examen.entelgy.util.response.ConsumerResponse;
import com.examen.entelgy.util.response.ProducesResponse;

public class ExamenTecnicoEntelgyServiceTest {
	
	@Mock
	ExamenTecnicoEntelgyInterfaceImpl repository;
	
	@InjectMocks
	ExamenTecnicoEntelgyServiceImpl services;
	
	@Mock
	RestTemplate restTemplate;
	
	List<UserProduces> listaProduces;
	List<UserConsumer> listaConsumer;
	
	UserProduces userProduces;
	UserConsumer userConsumer;
	
	ProducesResponse produces;
	
	ConsumerResponse consumer;
	@Value("${api.examen.tecnico.entelgy.url}")
	String url;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
		produces  = new ProducesResponse();
		listaConsumer = new ArrayList<>();
		userConsumer = new UserConsumer(1, "email@gmail.com", "Nombre", "apellido", "avatar....");
		listaConsumer.add(userConsumer);
		
		consumer = new ConsumerResponse(1, 1, 1, 1, listaConsumer, new SupportConsumer());
				
				
		listaProduces = new ArrayList<>();
		userProduces = new UserProduces(1, "roger", "rogercabrera2608@gmail.com");
		listaProduces.add(new UserProduces());
		produces.setData(listaProduces);
	}
	
	@Test
	void responseMyApiRest() {
		when(repository.consummerApiRestExternal(restTemplate, url)).thenReturn(consumer);
		when(repository.responseMyApiRest(restTemplate, url)).thenReturn(produces);
		assertNotNull(services.responseMyApiRest(restTemplate, url));
	}
	
}
