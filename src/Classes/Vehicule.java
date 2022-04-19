package classes;


public abstract  class Vehicule {

	 protected String marque ;
	 protected String modele ;
	 protected String inmatriculation ;
	 
	 public Vehicule(String marque , String modele , String inmatriculation ) {
		 
		 this.marque = marque ; 
		 this.modele = modele ;
		 this.inmatriculation= inmatriculation ; 
	}
	 
	 
	 
	 
	 
	 
	 
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modle) {
		this.modele = modle;
	}
	public String getInmatriculation() {
		return inmatriculation;
	}
	public void setInmatriculation(String inmatriculation) {
		this.inmatriculation = inmatriculation;
	}
	
	 
	 
}
