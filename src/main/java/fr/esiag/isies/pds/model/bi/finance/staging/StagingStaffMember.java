package fr.esiag.isies.pds.model.bi.finance.staging;

import fr.esiag.isies.pds.model.bi.finance.staging.StagingPerson;
import fr.esiag.isies.pds.model.bi.finance.staging.StagingService;

/**
 * This class is a model of a Staff Member
 * @author JASS KVI LAD YEL
 */

public class StagingStaffMember extends StagingPerson {
	
	/**
	 * Id of the number attribute to each staff member
	 */
	private String staffNumber;
	/**
	 * Profession of the Staff member
	 */
	private int idProfession;
	/**
	 * Specialty of the Staff member
	 */
	private int idSpeciality;
	/**
	 * Organization of the Staff member
	 */
	private int idOrganization;
	/**
	 * Service of the Staff member
	 */
	private StagingService idService;
	/**
	 * RPPS of the Phone Number Work
	 */
	private String phoneNumberWork;
	/**
	 * RPPS of the Phone Number Mobile
	 */
	private String phoneNumberMobile;
	/**
	 * RPPS of the Mail adress
	 */
	private String mailAdress;
	/**
	 * RPPS of the Staff member
	 */
	private String codeRPPS;
	/**
	 * RPPS of the Staff member
	 */
	private String codeADELI;
	/**
	 * RPPS of the Staff member
	 */
	private String availability;

	public String getCodeRPPS() {
		return codeRPPS;
	}

	public void setCodeRPPS(String codeRPPS) {
		this.codeRPPS = codeRPPS;
	}
	
	public String getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}
	
	public int getIdProfession() {
		return idProfession;
	}
	
	public void setIdProfession(int idProfession) {
		this.idProfession = idProfession;
	}

	public StagingService getIdService() {
		return idService;
	}

	public void setIdService(StagingService idService) {
		this.idService = idService;
	}

	public int getIdSpeciality() {
		return idSpeciality;
	}

	public void setIdSpeciality(int idSpeciality) {
		this.idSpeciality = idSpeciality;
	}

	public int getIdOrganization() {
		return idOrganization;
	}

	public void setIdOrganization(int idOrganization) {
		this.idOrganization = idOrganization;
	}

	public String getPhoneNumberWork() {
		return phoneNumberWork;
	}

	public void setPhoneNumberWork(String phoneNumberWork) {
		this.phoneNumberWork = phoneNumberWork;
	}

	public String getPhoneNumberMobile() {
		return phoneNumberMobile;
	}

	public void setPhoneNumberMobile(String phoneNumberMobile) {
		this.phoneNumberMobile = phoneNumberMobile;
	}

	public String getMailAdress() {
		return mailAdress;
	}

	public void setMailAdress(String mailAdress) {
		this.mailAdress = mailAdress;
	}

	public String getCodeADELI() {
		return codeADELI;
	}

	public void setCodeADELI(String codeADELI) {
		this.codeADELI = codeADELI;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
}
