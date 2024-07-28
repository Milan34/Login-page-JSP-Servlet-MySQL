package com.subh.entities;

public class client {
	
	private int id;
	private String p_name;
	private String p_details;
	private int p_quantity;
	private String p_m;
	
	public client() {
		
	}

	public client(int id, String p_name, String p_details, int p_quantity, String p_m) {
		super();
		this.id = id;
		this.p_name = p_name;
		this.p_details = p_details;
		this.p_quantity = p_quantity;
		this.p_m = p_m;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_details() {
		return p_details;
	}

	public void setP_details(String p_details) {
		this.p_details = p_details;
	}

	public int getP_quantity() {
		return p_quantity;
	}

	public void setP_quantity(int p_quantity) {
		this.p_quantity = p_quantity;
	}

	public String getP_m() {
		return p_m;
	}

	public void setP_m(String p_m) {
		this.p_m = p_m;
	}

	@Override
	public String toString() {
		return "client [id=" + id + ", p_name=" + p_name + ", p_details=" + p_details + ", p_quantity=" + p_quantity
				+ ", p_m=" + p_m + "]";
	}
	
	

}
