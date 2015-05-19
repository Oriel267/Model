package fr.esiag.isies.pds.model.bi.finance.staging;



import java.util.Set;

public class StagingreimbursementMedicalservice { 

	private int id_reimbursementMedicalservice;
	private int reimbursement_Medicalservice;
	private Set<StagingMedicalJourney> Medical_services;

	public int getId_reimbursementMedicalservice() {
		return id_reimbursementMedicalservice;
	}
	public void setId_reimbursementMedicalservice(int id_reimbursementMedicalservice) {
		this.id_reimbursementMedicalservice = id_reimbursementMedicalservice;
	}
	public int getReimbursement_Medicalservice() {
		return reimbursement_Medicalservice;
	}
	public void setReimbursement_Medicalservice(int reimbursement_Medicalservice) {
		this.reimbursement_Medicalservice = reimbursement_Medicalservice;
	}
	public Set<StagingMedicalJourney> getMedical_services() {
		return Medical_services;
	}
	public void setMedical_services(Set<StagingMedicalJourney> medical_services) {
		Medical_services = medical_services;
	}
	//48957929
}
