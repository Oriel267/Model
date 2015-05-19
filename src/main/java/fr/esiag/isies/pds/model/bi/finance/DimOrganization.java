package fr.esiag.isies.pds.model.bi.finance;

import fr.esiag.isies.pds.model.AbstractEntity;

public class DimOrganization extends AbstractEntity {

	/*
	 * Name of the organization
	 */
	private String name;
	/*
	 * SIRET number
	 */
	private String siret;
	/*
	 * Street number of the organization
	 */
	private int streetNumber;
	/*
	 * Type of the street
	 */
	private String streetType;
	/*
	 * Name of the street
	 */
	private String streetName;
	/*
	 * Zip code of the organisation
	 */
	private String zipCode;
	/*
	 * City of the orga.
	 */
	private String city;
	/*
	 * Department of the orga.
	 */
	private String department;
	/*
	 * Phone number
	 */
	private String phone;
	/*
	 * Fax
	 */
	private String fax;
	/*
	 * Legal email
	 */
	private String email;
	/*
	 * Legal status
	 */
	private String legalStatus;
	/*
	 * Latitude
	 *
	 */
	private Float latitude;
	/*
	 * Longitude
	 */
	private Float longitude;
	
	/*
	 * If orga is an hospital : FINESS number
	 */
	private String FINESS;
	
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetType() {
		return streetType;
	}
	public void setStreetType(String streetType) {
		this.streetType = streetType;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLegalStatus() {
		return legalStatus;
	}
	public void setLegalStatus(String legalStatus) {
		this.legalStatus = legalStatus;
	}
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public String getFINESS() {
		return FINESS;
	}

	public void setFINESS(String fINESS) {
		FINESS = fINESS;
	}
	
}

