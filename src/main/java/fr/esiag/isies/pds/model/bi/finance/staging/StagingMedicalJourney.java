package fr.esiag.isies.pds.model.bi.finance.staging;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import fr.esiag.isies.pds.model.bi.finance.staging.StagingPatient;

public class StagingMedicalJourney {

	private int idjourney;
	private String namejourney;
	private String status;
	private Set<StagingMedicalservice> medicalservices= new HashSet<StagingMedicalservice>();
	private StagingPatient patient;
	private Date startdate;
	private Date enddate;
	
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	
	public Set<StagingMedicalservice> getMedicalservices() {
		return medicalservices;
	}
	public void setMedicalservices(Set<StagingMedicalservice> medicalservices) {
		this.medicalservices = medicalservices;
	}
	public StagingPatient getPatient() {
		return patient;
	}
	public void setPatient(StagingPatient patient) {
		this.patient = patient;
	}
	public int getIdjourney() {
		return idjourney;
	}
	public void setIdjourney(int idjourney) {
		this.idjourney = idjourney;
	}
	public String getNamejourney() {
		return namejourney;
	}
	public void setNamejourney(String namejourney) {
		this.namejourney = namejourney;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
