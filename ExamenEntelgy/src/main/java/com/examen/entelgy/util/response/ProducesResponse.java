package com.examen.entelgy.util.response;

import java.util.List;

import com.examen.entelgy.entities.produces.UserProduces;

public class ProducesResponse {
	
	private List<UserProduces> data;
	
	public ProducesResponse() {
	}

	public ProducesResponse(List<UserProduces> data) {
		this.data = data;
	}

	public List<UserProduces> getData() {
		return data;
	}

	public void setData(List<UserProduces> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ProducesResponse [getData()=" + getData() + "]";
	}
	
}
