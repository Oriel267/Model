package fr.esiag.isies.pds.model.bi.finance.staging;

import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;
import net.sf.oval.constraint.Size;
import fr.esiag.isies.pds.model.AbstractType;

/**
 * Model of an organization type
 * @author SKO JLA OSA ADA JSB
 *
 */
public class StagingOrgaType extends AbstractType {
	
	/*
	 * Legal Status type
	 */
	@NotNull
	@NotEmpty
	@Size(min=2, max=45)
	private String legalStatus;
	private String label;
	
	public String getDescription() {
		return label;
	}
	public void setDescription(String description) {
		this.label = description;
	}
	public String getLegalStatus() {
		return legalStatus;
	}
	public void setLegalStatus(String legalStatus) {
		this.legalStatus = legalStatus;
	}	
		
}
