package fr.esiag.isies.pds.model.hospital.medical;

import fr.esiag.isies.pds.model.AbstractType;
/**
 * Model class for a type of medical act
 * @author Glawdys
 *
 */
public class TypeAct extends AbstractType {
	
	public String toSring(){
		return getLabel();
	}
	

}
