package com.examen.entelgy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.examen.entelgy.repository.Impl.ExamenTecnicoEntelgyInterfaceImpl;
import com.examen.entelgy.service.ExamenTecnicoEntelgyService;
import com.examen.entelgy.util.response.ProducesResponse;

@Service
public class ExamenTecnicoEntelgyServiceImpl implements ExamenTecnicoEntelgyService{
	
	@Autowired
	ExamenTecnicoEntelgyInterfaceImpl examenTecnicoEntelgyInterfaceImpl; 

	@Override
	public ProducesResponse responseMyApiRest(RestTemplate restTemplate, String url) {
		return examenTecnicoEntelgyInterfaceImpl.responseMyApiRest(restTemplate, url);
	}

}
