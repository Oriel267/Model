package fr.esiag.isies.pds.model.bi.finance;

import fr.esiag.isies.pds.model.hospital.medical.TypeAct;
import fr.esiag.isies.pds.model.referential.organization.OrgaType;
import fr.esiag.isies.pds.model.referential.organization.ServiceType;

public class factBilingAct {
	
	private int idBillingAct;
	private DimOrganization orga;
	private OrgaType orgatype;
	private DimServiceType serviceType;
	private DimDate date;
	private DimMedicalAct ccam;
	private TypeAct typeAct;
	private int nbAct;
	private int factActRefund;
	private double caAct;
	
	public factBilingAct(){}
	
	public int getIdBillingAct() {
		return idBillingAct;
	}
	public void setIdBillingAct(int idBillingAct) {
		this.idBillingAct = idBillingAct;
	}
	public DimOrganization getOrga() {
		return orga;
	}
	public void setOrga(DimOrganization orga) {
		this.orga = orga;
	}
	public OrgaType getOrgatype() {
		return orgatype;
	}
	public void setOrgatype(OrgaType orgatype) {
		this.orgatype = orgatype;
	}
	public DimServiceType getServiceType() {
		return serviceType;
	}
	public void setServiceType(DimServiceType serviceType) {
		this.serviceType = serviceType;
	}
	public DimDate getDate() {
		return date;
	}
	public void setDate(DimDate date) {
		this.date = date;
	}
	public DimMedicalAct getCcam() {
		return ccam;
	}
	public void setCcam(DimMedicalAct ccam) {
		this.ccam = ccam;
	}
	public TypeAct getTypeAct() {
		return typeAct;
	}
	public void setTypeAct(TypeAct typeAct) {
		this.typeAct = typeAct;
	}
	public int getFactActRefund() {
		return factActRefund;
	}
	public void setFactActRefund(int factActRefund) {
		this.factActRefund = factActRefund;
	}
	public double getCaAct() {
		return caAct;
	}
	public void setCaAct(double caAct) {
		this.caAct = caAct;
	}

	public int getNbAct() {
		return nbAct;
	}

	public void setNbAct(int nbAct) {
		this.nbAct = nbAct;
	}

}
