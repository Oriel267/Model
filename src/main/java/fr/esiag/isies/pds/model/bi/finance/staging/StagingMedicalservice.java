package fr.esiag.isies.pds.model.bi.finance.staging;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class StagingMedicalservice {
	
	private int id_medicalservice;
	private Set<StagingMedicalJourney> medicaljourney= new HashSet<StagingMedicalJourney>();;
	private String name_medicalservice;
	private StagingCostsMedicalservice Costs_medicalservice;
	private StagingreimbursementMedicalservice reimbursements_Medicalservice;
	private Date dateAct;
	
	public Date getDateAct() {
		return dateAct;
	}
	public void setDateAct(Date dateAct) {
		this.dateAct = dateAct;
	}
	public StagingreimbursementMedicalservice getReimbursements_Medicalservice() {
		return reimbursements_Medicalservice;
	}
	public void setReimbursements_Medicalservice(
			StagingreimbursementMedicalservice reimbursements_Medicalservice) {
		this.reimbursements_Medicalservice = reimbursements_Medicalservice;
	}
	public StagingCostsMedicalservice getCosts_medicalservice() {
		return Costs_medicalservice;
	}
	public void setCosts_medicalservice(StagingCostsMedicalservice costs_medicalservice) {
		Costs_medicalservice = costs_medicalservice;
	}
	public int getId_medicalservice() {
		return id_medicalservice;
	}
	public void setId_medicalservice(int id_medicalservice) {
		this.id_medicalservice = id_medicalservice;
	}
	
	
	public Set<StagingMedicalJourney> getMedicaljourney() {
		return medicaljourney;
	}
	public void setMedicaljourney(Set<StagingMedicalJourney> medicaljourney) {
		this.medicaljourney = medicaljourney;
	}
	public String getName_medicalservice() {
		return name_medicalservice;
	}
	public void setName_medicalservice(String name_medicalservice) {
		this.name_medicalservice = name_medicalservice;
	}
	
}