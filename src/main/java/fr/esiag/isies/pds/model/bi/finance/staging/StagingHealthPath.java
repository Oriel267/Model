package fr.esiag.isies.pds.model.bi.finance.staging;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import fr.esiag.isies.pds.model.AbstractEntity;
import fr.esiag.isies.pds.model.bi.finance.staging.StagingMedicalRecord;

public class StagingHealthPath extends AbstractEntity {
	private int id;
	private StagingOrganization myOrganization;
	private Date startDate;
	private Date endDate;
	private String currentState;
	private StagingMedicalRecord medicalRecord;
	private Set<StagingHealthPathStep> steps = new HashSet<StagingHealthPathStep>(0);

	public StagingHealthPath(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}

	public Set<StagingHealthPathStep> getSteps() {
		return steps;
	}

	public void setSteps(Set<StagingHealthPathStep> steps) {
		this.steps = steps;
	}

	public StagingOrganization getMyOrganization() {
		return myOrganization;
	}

	public void setMyOrganization(StagingOrganization myOrganization) {
		this.myOrganization = myOrganization;
	}

	public StagingMedicalRecord getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(StagingMedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}
	
}
