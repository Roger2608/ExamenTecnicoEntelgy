package com.examen.entelgy.service;

import org.springframework.web.client.RestTemplate;

import com.examen.entelgy.util.response.ProducesResponse;

public interface ExamenTecnicoEntelgyService {
	
	public ProducesResponse responseMyApiRest(RestTemplate restTemplate, String url);
	
}
