package com.light.domain;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 6102526449700267066L;
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
