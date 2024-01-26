package com.javahongkong.bootcamp.exercise;

import java.util.Objects;

public class Company extends AccountHolder {
	private String companyName;

	public Company(String companyName, int taxId) {
		// complete the function
		super(taxId);
		this.companyName = companyName;
	}

	public String getCompanyName() {
		// complete the function
		return this.companyName;
	}

}
