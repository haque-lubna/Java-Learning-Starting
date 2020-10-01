package com.dsi.SecondTimeHibernate.mappingRelation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	
	@OneToMany(mappedBy = "alien", fetch=FetchType.EAGER)
	private List<Laptop2> laptop = new ArrayList<Laptop2>();

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public List<Laptop2> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop2> laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}

	
	
	
	
}
