package fr.esiag.isies.pds.model.bi.finance;


public class DimMedicalAct {
	
	private int id;
	/**
	 * Act code
	 */	
	private String codeAct;
	/**
	 * Act full name
	 */
	private String nameAct;
	/**
	 * Price of act
	 */
	private double actPrice;
	/**
	 * Refund policy
	 */
	private int refund;
	/**
	 * Grouping code
	 */
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
	public double getActPrice() {
		return actPrice;
	}
	public void setActPrice(double actPrice) {
		this.actPrice = actPrice;
	}
	public int getRefund() {
		return refund;
	}
	public void setRefund(int refund) {
		this.refund = refund;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
