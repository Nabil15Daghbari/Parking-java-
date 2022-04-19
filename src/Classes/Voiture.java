package classes;

public class Voiture extends Vehicule {
	
	private int nombrePortes ;
	
	
	// pzrceque le classe super Vehicule contient un constructeur paraméter 
	public Voiture(String marque , String modele , String inmatriculation , int nombrePorstes) {
		
		super(marque , modele , inmatriculation);
		
		this.nombrePortes = nombrePorstes ;
		
	}


	
	
	
	public int getNombrePortes() {
		return nombrePortes;
	}


	public void setNombrePortes(int nombrePortes) {
		this.nombrePortes = nombrePortes;
	}

    @Override
    public String toString() {
        String affichage =" la voiture " + getMarque() + " " + getModele() +" " + "d'inmatriculation " + getInmatriculation() + " contient " + getNombrePortes() +" porte " ;
        return affichage ;
    }
 
	
        
	
}
