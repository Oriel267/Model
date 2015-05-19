package fr.esiag.isies.pds.model.bi.finance.staging;

import java.util.Set;

public class StagingCostsMedicalservice {

	private int id_Costsmedicalservice;
	private int Costs_mediclservice;
	private Set<StagingMedicalservice> Medical_services;
	public int getId_Costsmedicalservice() {
		return id_Costsmedicalservice;
	}
	public void setId_Costsmedicalservice(int id_Costsmedicalservice) {
		this.id_Costsmedicalservice = id_Costsmedicalservice;
	}
	public int getCosts_mediclservice() {
		return Costs_mediclservice;
	}
	public void setCosts_mediclservice(int costs_mediclservice) {
		Costs_mediclservice = costs_mediclservice;
	}
	public Set<StagingMedicalservice> getMedical_services() {
		return Medical_services;
	}
	public void setMedical_services(Set<StagingMedicalservice> medical_services) {
		Medical_services = medical_services;
	}
	
}