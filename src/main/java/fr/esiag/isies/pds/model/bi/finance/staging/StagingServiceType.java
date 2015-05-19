package fr.esiag.isies.pds.model.bi.finance.staging;

import java.util.HashSet;
import java.util.Set;

import fr.esiag.isies.pds.model.AbstractType;

/**
 * Model of service type
 * @author SKO JLA OSA ADA JSB
 *
 */
public class StagingServiceType extends AbstractType {
	/**
	 * indicate the type of organization for which the service is created
	 */
	private String categoryService;
	
	private Set<StagingOrganization> organizationSet = new HashSet<StagingOrganization>(0);

	public String getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(String categoryService) {
		this.categoryService = categoryService;
	}

	public Set<StagingOrganization> getOrganizationSet() {
		return organizationSet;
	}

	public void setOrganizationSet(Set<StagingOrganization> organizationSet) {
		this.organizationSet = organizationSet;
	}
	
}
