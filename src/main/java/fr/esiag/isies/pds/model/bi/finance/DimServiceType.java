package fr.esiag.isies.pds.model.bi.finance;

public class DimServiceType {
	
		private int id;
		private String serviceTypecode;
		private String serviceTypeDecription;
		
		public DimServiceType(){}
		
		public DimServiceType(int id2, String code, String categoryService) {
			this.id = id2;
			this.serviceTypecode = code;
			this.serviceTypeDecription = categoryService;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getServiceTypecode() {
			return serviceTypecode;
		}
		public void setServiceTypecode(String serviceTypecode) {
			this.serviceTypecode = serviceTypecode;
		}
		public String getServiceTypeDecription() {
			return serviceTypeDecription;
		}
		public void setServiceTypeDecription(String serviceTypeDecription) {
			this.serviceTypeDecription = serviceTypeDecription;
		}


}
