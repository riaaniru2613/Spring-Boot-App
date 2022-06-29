package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master_data")
public class LoginData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ; 
	
	@Column(name = "district")
	private String district ;
	
	@Column(name = "area")
	private String area ;
	
	
	@Column(name = "town")
	private String town ;
	
	@Column(name = "zone")
	private String zone ;
	
	public LoginData() {}

	public LoginData(int id, String district, String area, String town, String zone) {
		this.id = id;
		this.district = district;
		this.area = area;
		this.town = town;
		this.zone = zone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	@Override
	public String toString() {
		return "LoginData [id=" + id + ", district=" + district + ", area=" + area + ", town=" + town + ", zone=" + zone
				+ "]";
	}
	
	

}
