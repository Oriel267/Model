package fr.esiag.isies.pds.model.bi.finance.staging;

import fr.esiag.isies.pds.model.AbstractEntity;
/**
 * Model class for a medical act
 * @author Glawdys
 *
 */
public class StagingMedicalAct extends AbstractEntity {
	
	
	private double actPrice;
	
	/**
	 * Act code
	 */
		
	private String codeAct;
	/**
	 * Act full name
	 */
	private String nameAct;
	/**
	 * Type of the act
	 */
	private StagingTypeAct idtypeAct;
	/**
	 * Act time
	 */
	private Integer actTime;
	
	/**
	 * Price of the act
	 */
	
	private String actNote;
	/**
	 * Exoneration rule
	 */
	private String exonerationRule;
	/**
	 * Refund policy
	 */
	
	private int refund;
	/**
	 * Grouping code
	 */
	private String groupingCode;
	
	/**
	 * Whether the act is considered like a principal act
	 */
	private  int isPrincipal;
	
	public String getCodeAct() {
		return codeAct;
	}
	public void setCodeAct(String codeAct) {
		this.codeAct = codeAct;
	}
	public String getNameAct() {
		return nameAct;
	}
	public void setNameAct(String nameAct) {
		this.nameAct = nameAct;
	}
	
	public Integer getActTime() {
		return actTime;
	}
	public void setActTime(Integer actTime) {
		this.actTime = actTime;
	}
	
	public double getActPrice() {
		return actPrice;
	}
	public void setActPrice(double actPrice) {
		this.actPrice = actPrice;
	}
	public StagingTypeAct getIdtypeAct() {
		return idtypeAct;
	}
	public void setIdtypeAct(StagingTypeAct idtypeAct) {
		this.idtypeAct = idtypeAct;
	}
	public String getActNote() {
		return actNote;
	}
	public void setActNote(String actNote) {
		this.actNote = actNote;
	}
	public String getExonerationRule() {
		return exonerationRule;
	}
	public void setExonerationRule(String exonerationRule) {
		this.exonerationRule = exonerationRule;
	}
	public int getRefund() {
		return refund;
	}
	public void setRefund(int refund) {
		this.refund = refund;
	}
	public String getGroupingCode() {
		return groupingCode;
	}
	public void setGroupingCode(String groupingCode) {
		this.groupingCode = groupingCode;
	}
	public int getIsPrincipal() {
		return isPrincipal;
	}
	public void setIsPrincipal(int isPrincipal) {
		this.isPrincipal = isPrincipal;
	}
	
}

