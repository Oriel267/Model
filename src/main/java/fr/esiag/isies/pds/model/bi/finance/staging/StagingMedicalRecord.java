package fr.esiag.isies.pds.model.bi.finance.staging;

import java.util.HashSet;
import java.util.Set;

import fr.esiag.isies.pds.model.AbstractEntity;
import fr.esiag.isies.pds.model.bi.finance.staging.StagingHealthPath;
import fr.esiag.isies.pds.model.bi.finance.staging.StagingPatient;

/**
 * This class is a model of a MedicalRecord
 * @author LAD
 */
public class StagingMedicalRecord{
	private int id;
	/**
	 * Height of patient
	 */
	private String height;  
	/**
	 * Weight of patient
	 */
	private String weight;
	/**
	 * Blood group of patient 
	 */
	private String bloodGroup;
	/**
	 * Type of patient
	 */
	private String typePatient;
	/**
	 * Status of patient 
	 */
	private String statusPatient;
	/**
	 * Patient which own the medical record 
	 */
	private int age;
	
	
	/**
	 * Healthpath associate with the medical record
	 */
	private Set<StagingHealthPath> healthPaths = new HashSet<StagingHealthPath>(0);

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHeight() {
		return height;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	
	public String getWeight() {
		return weight;
	}
	
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	public String getBloodGroup() {
		return bloodGroup;
	}
	
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getTypePatient() {
		return typePatient;
	}

	public void setTypePatient(String typePatient) {
		this.typePatient = typePatient;
	}

	public String getStatusPatient() {
		return statusPatient;
	}

	public void setStatusPatient(String statusPatient) {
		this.statusPatient = statusPatient;
	}

	public Set<StagingHealthPath> getHealthPaths() {
		return healthPaths;
	}

	public void setHealthPaths(Set<StagingHealthPath> healthPaths) {
		this.healthPaths = healthPaths;
	}
}
