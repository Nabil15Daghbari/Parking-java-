package classes;

public class Camion extends Vehicule{
	
	public boolean remorque ;
	
	
	public Camion (String marque , String modele , String inmatriculation ,  boolean remorque){
		
		super(marque , modele , inmatriculation);
		this.remorque= remorque ;
		
	}


	public boolean isRemorque() {
		return remorque;
	}


	public void setRemorque(boolean remorque) {
		this.remorque = remorque;
	}

    @Override
    public String toString() {
        String affichage ; 
        if(isRemorque()){
            affichage= "le camion" + getMarque() + " " +getModele() +" d'inmatrication  " +getInmatriculation() + "contient un remorque " ;
        }else{
            affichage = "le camion" + getMarque() + " " +getModele() + " d'inmatrication  " +getInmatriculation() +" " + "ne contient pas un remorque " ;
        }
            return affichage ;
    }
	
	
    
	

}
