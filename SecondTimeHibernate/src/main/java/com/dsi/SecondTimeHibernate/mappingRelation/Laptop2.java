package com.dsi.SecondTimeHibernate.mappingRelation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop2 {
	@Id
	private int lid;
	private String brand;
	private int price;
	
	@ManyToOne
	private Alien alien;

	public int getAid() {
		return lid;
	}

	public void setLid(int aid) {
		this.lid = aid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Alien getAlien() {
		return alien;
	}

	public void setAlien(Alien alien) {
		this.alien = alien;
	}

	@Override
	public String toString() {
		return "Laptop2 [aid=" + lid + ", brand=" + brand + ", price=" + price + ", alien=" + alien + "]";
	}
	
	
	
}
