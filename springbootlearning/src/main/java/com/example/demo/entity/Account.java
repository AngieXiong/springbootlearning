package com.example.demo.entity;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

public class Account {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double money;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
}
