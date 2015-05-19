package fr.esiag.isies.pds.model.bi.finance.staging;

import java.util.ArrayList;

public class StagingAssociationActSpéService {
	
	private ArrayList <Integer> ListServiceFor;
	
	public ArrayList<Integer> getListServiceFor() {
		return ListServiceFor;
	}
	public void setListServiceFor(ArrayList<Integer> listServiceFor) {
		ListServiceFor = listServiceFor;
	}
	
public void conteneur (){
	int i = 0;
	while(this.getListServiceFor().size()<i){
		System.out.println("indice de lobjet : " + this.getListServiceFor().get(i));
		i++;
	}
}
	
	

}
