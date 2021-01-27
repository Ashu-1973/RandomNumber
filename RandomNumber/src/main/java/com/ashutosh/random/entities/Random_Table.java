package com.ashutosh.random.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Random_Table {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String rnumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRnumber() {
		return rnumber;
	}

	public void setRnumber(String rnumber) {
		this.rnumber = rnumber;
	}

	public Random_Table(String rnumber) {
		super();
		this.rnumber = rnumber;
	}

}
