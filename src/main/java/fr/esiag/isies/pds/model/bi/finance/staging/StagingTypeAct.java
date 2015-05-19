package fr.esiag.isies.pds.model.bi.finance.staging;

import fr.esiag.isies.pds.model.AbstractType;
/**
 * Model class for a type of medical act
 * @author Glawdys
 *
 */
public class StagingTypeAct extends AbstractType {
	private int id;
	private String label;
	private String code;
	
	public String toSring(){
		return getLabel();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	

}
