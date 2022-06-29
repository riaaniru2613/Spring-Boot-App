package com.example.demo.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="user")
public class User {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ; 
		
	@Column(name = "name")
	private String name ; 
		
	@Column(name="father_name")
	private String fatherName ;
	
	@Column(name = "dob")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthdate;
	
	@Column(name="gender")
	private String gender ;
	
	@Column(name="nominee_name")
	private String nomineeName ;
	
	@Column(name="relationship")
	private String relationship ;
	
	@Column(name = "mobile_number")
	private String mobileNumber ;
	
	@Column(name = "phone_number")
	private String phoneNumber ;
	
	
	@Column(name = "email")
	private String email ;
	
	@Column(name = "house_number")
	private String houseNumber ;
	
	@Column(name = "locality")
	private String locality ;
	
	@Column(name = "street")
	private String street ;
	
	@Column(name = "landmark")
	private String landmark ;
	
	@Column(name = "pin")
	private int pin ;
	
	
	//CONSTRUCTOR
	public User() {
		
	}

	public User(int id, String name, String fatherName, Date birthdate, String gender, String nomineeName,
			String relationship, String mobileNumber, String phoneNumber, String email, String houseNumber,
			String locality, String street, String landmark, int pin) {
		
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.birthdate = birthdate;
		this.gender = gender;
		this.nomineeName = nomineeName;
		this.relationship = relationship;
		this.mobileNumber = mobileNumber;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.houseNumber = houseNumber;
		this.locality = locality;
		this.street = street;
		this.landmark = landmark;
		this.pin = pin;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", birthdate=" + birthdate
				+ ", gender=" + gender + ", nomineeName=" + nomineeName + ", relationship=" + relationship
				+ ", mobileNumber=" + mobileNumber + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", houseNumber=" + houseNumber + ", locality=" + locality + ", street=" + street + ", landmark="
				+ landmark + ", pin=" + pin + "]";
	}

	
 
	
	
	
}
