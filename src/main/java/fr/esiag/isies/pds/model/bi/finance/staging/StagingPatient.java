package fr.esiag.isies.pds.model.bi.finance.staging;

import fr.esiag.isies.pds.model.bi.finance.staging.StagingPerson;
import fr.esiag.isies.pds.model.bi.finance.staging.StagingMedicalJourney;
import fr.esiag.isies.pds.model.bi.finance.staging.StagingMedicalRecord;
import fr.esiag.isies.pds.model.bi.finance.staging.StagingHospital;

public class StagingPatient extends StagingPerson{

	/**
	 * Social security number of patient 
	 */
	private String nir; 
	/** 
	 * Medical Record of patient
	 */
	private StagingMedicalRecord medicalRecord;
	/**
	 * RPPS of the Phone Number Work
	 */
	private String phoneNumberHome;
	/**
	 * RPPS of the Phone Number Mobile
	 */
	private String phoneNumberMobile;
	/**
	 * RPPS of the Mail adress
	 */
	private String mailAdress;
	
	private int idOrganization;
	
	private StagingHospital hospital;
	
	private StagingMedicalJourney medicaljourney;
	
	public String getNir() {
		return nir;
	}
	public void setNir(String nir) {
		this.nir = nir;
	}
	public StagingMedicalRecord getMedicalRecord() {
		return medicalRecord;
	}
	public void setMedicalRecord(StagingMedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}
	public String getPhoneNumberHome() {
		return phoneNumberHome;
	}
	public void setPhoneNumberHome(String phoneNumberHome) {
		this.phoneNumberHome = phoneNumberHome;
	}
	public String getPhoneNumberMobile() {
		return phoneNumberMobile;
	}
	public void setPhoneNumberMobile(String phoneNumberMobile) {
		this.phoneNumberMobile = phoneNumberMobile;
	}
	public String getMailAdress() {
		return mailAdress;
	}
	public StagingMedicalJourney getMedicaljourney() {
		return medicaljourney;
	}
	public void setMedicaljourney(StagingMedicalJourney medicaljourney) {
		this.medicaljourney = medicaljourney;
	}
	public void setMailAdress(String mailAdress) {
		this.mailAdress = mailAdress;
	}
	public int getIdOrganization() {
		return idOrganization;
	}
	public void setIdOrganization(int idOrganization) {
		this.idOrganization = idOrganization;
	}
	public StagingHospital getHospital() {
		return hospital;
	}
	public void setHospital(StagingHospital hospital) {
		this.hospital = hospital;
	}

}
