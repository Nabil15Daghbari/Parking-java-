package classes;

public class Moto extends Vehicule  {
	
	private int vitesseMax ;
	public Moto(String marque , String modele , String inmatriculation , int vitesseMax  ) {
		super(marque , modele , inmatriculation);
		this.vitesseMax = vitesseMax;
	}
	
	
	public int getVitesseMax() {
		return vitesseMax;
	}
	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	
         @Override
    public String toString() {
        String affichage =" le moto " + getMarque() + " " + getModele() + "d'inmatriculation " + getInmatriculation() + " contient " + getVitesseMax()+" porte " ;
        return affichage ;
    }
}
