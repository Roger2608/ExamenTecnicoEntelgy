package com.examen.entelgy.repository;

import org.springframework.web.client.RestTemplate;

import com.examen.entelgy.util.response.ConsumerResponse;
import com.examen.entelgy.util.response.ProducesResponse;

public interface ExamenTecnicoEntelgyInterface {
	
	public ConsumerResponse consummerApiRestExternal(RestTemplate restTemplate,String url);
	public ProducesResponse responseMyApiRest(RestTemplate restTemplate,String url);
	
}
