package fr.esiag.isies.pds.model.bi.finance.staging;

import java.util.HashSet;
import java.util.Set;

import fr.esiag.isies.pds.model.bi.finance.staging.StagingPatient;

public class StagingHospital extends StagingOrganization{
	
		
		/**
		 * FINESS number of the hospital
		 */
		private String finess;
		private Set<StagingPatient> patients = new HashSet<StagingPatient>(0);

		public Set<StagingPatient> getPatients() {
			return patients;
		}

		public void setPatients(Set<StagingPatient> patients) {
			this.patients = patients;
		}

		public String getFiness() {
			return finess;
		}

		public void setFiness(String finess) {
			this.finess = finess;
		}
		
	}
