package com.dibs.model;

public class Support {
	private String openhours;
	private String phone;
	private String title;

	public String getHours() {
		return openhours;
	}

	public Support setHours(String openhours) {
		this.openhours = openhours;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public Support setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public Support setTitle(String title) {
		this.title = title;
		return this;
	}
}
