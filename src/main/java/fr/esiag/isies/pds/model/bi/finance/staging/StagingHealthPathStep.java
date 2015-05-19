package fr.esiag.isies.pds.model.bi.finance.staging;

import java.util.Date;

import fr.esiag.isies.pds.model.AbstractEntity;

public class StagingHealthPathStep extends AbstractEntity {
	private Date startDate;
	private Date endDate;
	private String status;
	private StagingServiceType serviceType;
	private StagingHealthPath healthPath;

	public StagingHealthPathStep(){}
	
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
	public StagingHealthPath getHealthPath() {
		return healthPath;
	}
	public void setHealthPath(StagingHealthPath healthPath) {
		this.healthPath = healthPath;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public StagingServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(StagingServiceType serviceType) {
		this.serviceType = serviceType;
	}
	
}