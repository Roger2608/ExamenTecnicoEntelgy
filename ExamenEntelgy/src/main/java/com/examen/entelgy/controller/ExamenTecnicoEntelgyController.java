package com.examen.entelgy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.examen.entelgy.service.impl.ExamenTecnicoEntelgyServiceImpl;
import com.examen.entelgy.util.response.ProducesResponse;

@RestController
public class ExamenTecnicoEntelgyController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ExamenTecnicoEntelgyServiceImpl service;
	
	@Value("${api.examen.tecnico.entelgy.url}")
	String apiRestConsummerUrl;
	
	@PostMapping("/data/users")
	public ProducesResponse getApi() {
		return service.responseMyApiRest(restTemplate,apiRestConsummerUrl);
	}
	

}
