package com.ssktechhub.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="laptop_details")
public class Laptop {
	@Id
	@Column(name = "laptop_id")
	private int id;
	
	@Column(name = "laptop_brand")
	private String brand;
	
	@Column(name = "laptop_model")
	private String model;
	
	@Column(name = "laptop_processor")
	private String processor;
	
	@Column(name = "laptop_storage_in_GB")
	private int storage;
	
	@Column(name = "laptop_price")
	private double price;
	
	public Laptop() {
		super();
	}

	public Laptop(int id, String brand, String model, String processor, int storage, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.storage = storage;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", model=" + model + ", processor=" + processor + ", storage="
				+ storage + ", price=" + price + "]";
	}

}
