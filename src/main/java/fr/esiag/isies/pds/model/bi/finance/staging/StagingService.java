package fr.esiag.isies.pds.model.bi.finance.staging;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import fr.esiag.isies.pds.model.AbstractEntity;

public class StagingService extends AbstractEntity {
	/**
	 * The id of the organization in which the service is provided 
	 */
	private int idOrganizaton;
	/**
	 * The id of the ServiceType provided 
	 */
	private int idServiceTypeCurrent;
	/**
	 * The ids of services selected by user input 
	 */
	private ArrayList<Integer> listIdTypeOfServices= new ArrayList<Integer>();
	/**
	 * The set of Service types selected by the user  
	 */
	private Set<StagingServiceType> services = new HashSet<StagingServiceType>();
	
	public int getIdOrganizaton() {
		return idOrganizaton;
	}
	public void setIdOrganizaton(int idOrganizaton) {
		this.idOrganizaton = idOrganizaton;
	}
	public int getIdServiceTypeCurrent() {
		return idServiceTypeCurrent;
	}
	public void setIdServiceTypeCurrent(int idServiceTypeCurrent) {
		this.idServiceTypeCurrent = idServiceTypeCurrent;
	}
	public ArrayList<Integer> getListIdTypeOfServices() {
		return listIdTypeOfServices;
	}
	public void setListIdTypeOfServices(ArrayList<Integer> listIdTypeOfServices) {
		this.listIdTypeOfServices = listIdTypeOfServices;
	}
	public Set<StagingServiceType> getServices() {
		return services;
	}
	public void setServices(Set<StagingServiceType> services) {
		this.services = services;
	}
	
}
