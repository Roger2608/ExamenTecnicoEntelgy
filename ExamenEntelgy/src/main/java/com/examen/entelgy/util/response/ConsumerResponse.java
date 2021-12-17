package com.examen.entelgy.util.response;

import java.util.List;

import com.examen.entelgy.entities.consumer.SupportConsumer;
import com.examen.entelgy.entities.consumer.UserConsumer;

public class ConsumerResponse {

	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private List<UserConsumer> data;
	private SupportConsumer support;
	
	public ConsumerResponse() {
	}

	public ConsumerResponse(int page, int per_page, int total, int total_pages, List<UserConsumer> data, SupportConsumer support) {
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.data = data;
		this.support = support;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPer_page() {
		return per_page;
	}

	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}

	public List<UserConsumer> getData() {
		return data;
	}

	public void setData(List<UserConsumer> data) {
		this.data = data;
	}

	public SupportConsumer getSupport() {
		return support;
	}

	public void setSupport(SupportConsumer support) {
		this.support = support;
	}

	@Override
	public String toString() {
		return "ConsumerResponse [getPage()=" + getPage() + ", getPer_page()=" + getPer_page() + ", getTotal()="
				+ getTotal() + ", getTotal_pages()=" + getTotal_pages() + ", getData()=" + getData() + ", getSupport()="
				+ getSupport() + "]";
	}

}
