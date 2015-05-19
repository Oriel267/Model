package fr.esiag.isies.pds.model.bi.finance.staging;


public class StagingMedicalStep extends StagingHealthPathStep{
	private StagingMedicalAct medicalAct;

	public StagingMedicalAct getMedicalAct() {
		return medicalAct;
	}

	public void setMedicalAct(StagingMedicalAct medicalAct) {
		this.medicalAct = medicalAct;
	}	
}
