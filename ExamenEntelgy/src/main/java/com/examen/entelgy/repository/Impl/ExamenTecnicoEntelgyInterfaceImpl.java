package com.examen.entelgy.repository.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.examen.entelgy.entities.produces.UserProduces;
import com.examen.entelgy.repository.ExamenTecnicoEntelgyInterface;
import com.examen.entelgy.util.response.ConsumerResponse;
import com.examen.entelgy.util.response.ProducesResponse;

@Repository
public class ExamenTecnicoEntelgyInterfaceImpl implements ExamenTecnicoEntelgyInterface{
	
	@Override
	public ConsumerResponse consummerApiRestExternal(RestTemplate restTemplate,String url) {
		ConsumerResponse consumerResponse = restTemplate.getForObject(url, ConsumerResponse.class);
		return consumerResponse;
	}

	@Override
	public ProducesResponse responseMyApiRest(RestTemplate restTemplate,String url) {
		ProducesResponse producesResponse = new ProducesResponse();
		generateProducesResponse(consummerApiRestExternal(restTemplate,url),producesResponse);
		return producesResponse;
	}
	
	private void generateProducesResponse(ConsumerResponse consumerResponse, ProducesResponse producesResponse) {
		List<UserProduces> listUserProduces = new ArrayList<>();
		consumerResponse.getData().parallelStream().forEach(userConsumer -> {
			UserProduces userProduces = new UserProduces();
			userProduces.setId(userConsumer.getId());
			userProduces.setLastName(userConsumer.getLast_name());
			userProduces.setEmail(userConsumer.getEmail());
			listUserProduces.add(userProduces);
		});
		producesResponse.setData(listUserProduces);
	}
}
