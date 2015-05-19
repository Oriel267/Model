package fr.esiag.isies.pds.model.hospital.medical;


import fr.esiag.isies.pds.model.AbstractEntity;

/**
 * Model class for medical protocols
 * @author Glawdys
 *
 */
public class MedicalProtocol extends AbstractEntity {

	private String code;
	/**
	 * Id of the principal of the protocol
	 */
	private  int idPrincipalMedicalAct;
	/**
	 * Id of the act associated to the principal act
	 */
	private MedicalAct idSubMedicalAct;
	/**
	 * It's the time to wait between two act in the protocol
	 */
	private int timeToWait;
	/**
	 * Order of the act done in the protocol
	 */
	private int orderInProtocol;
	
	
	public int getIdPrincipalMedicalAct() {
		return idPrincipalMedicalAct;
	}
	public void setIdPrincipalMedicalAct(int idPrincipalMedicalAct) {
		this.idPrincipalMedicalAct = idPrincipalMedicalAct;
	}
	public MedicalAct getIdSubMedicalAct() {
		return idSubMedicalAct;
	}
	public void setIdSubMedicalAct(MedicalAct idSubMedicalAct) {
		this.idSubMedicalAct = idSubMedicalAct;
	}
	public int getOrderInProtocol() {
		return orderInProtocol;
	}
	public void setOrderInProtocol(int orderInProtocol) {
		this.orderInProtocol = orderInProtocol;
	}
	public int getTimeToWait() {
		return timeToWait;
	}
	public void setTimeToWait(int timeToWait) {
		this.timeToWait = timeToWait;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}
