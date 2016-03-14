package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class Isbn {

	private String intlCode;
	private String category;

	public String getIntlCode() {
		return intlCode;
	}

	public void setIntlCode(String intlCode) {
		this.intlCode = intlCode;
	}

	public String getcategory() {
		return category;
	}

	public void setcategory(String category) {
		this.category = category;
	}

	public Isbn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Isbn(String intlCode, String category) {
		super();
		this.intlCode = intlCode;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Isbn [intlCode=" + intlCode + ", category=" + category + "]";
	}

}
