package com.dibs.model;

public class Links {
	private String linkname;
	private String linkatribut;
	
	public Links setUsername(String linkname) {
		this.linkname = linkname;
		return this;
	}
	
	public String getLinkName() {
		return linkname;
	}

	public String getLinkatribut() {
		return linkatribut;
	}

	public Links setLinkatribut(String linkatribut) {
		this.linkatribut = linkatribut;
		return this;
	}
}
