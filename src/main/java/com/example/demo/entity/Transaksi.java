package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "transaksi")
public class Transaksi {
	
	@Id
	@GeneratedValue
	private int trx_id;
	private int user_id;
	private int company_id;
	private int amount;
	private String type;
	
	public int getTrx_id() {
		return trx_id;
	}
	public void setTrx_id(int trx_id) {
		this.trx_id = trx_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
