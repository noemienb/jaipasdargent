package ab;

public class Vehicule {
    String marque;
    String couleur;
    int nbrPlace;
    String typeEnergie;

    public Vehicule(String marque, String couleur, int nbrPlace, String typeEnergie) {
        this.marque = marque;
        this.couleur = couleur;
        this.nbrPlace = nbrPlace;
        this.typeEnergie = typeEnergie;
    }

    public String decrire() {
        return this.marque + " " + this.couleur + " a " + this.nbrPlace + " places.";
    }
}
