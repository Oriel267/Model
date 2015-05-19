package fr.esiag.isies.pds.model.bi.finance.staging;

import java.util.Date;

import fr.esiag.isies.pds.model.AbstractEntity;

public class StagingPerson extends AbstractEntity {
	
	private String firstName;
	private String lastName;
	private Character gender;
	private Date birthdate;
	private StagingAddress address;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public StagingAddress getAddress() {
		return address;
	}
	public void setAddress(StagingAddress address) {
		this.address = address;
	}
	
} 