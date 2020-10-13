package ab;

public class Agence {
    String nom;
    String ville;

    public Agence(String nom, String ville) {
        this.nom = nom;
        this.ville = ville;
    }

    public void louer(Vehicule vehicule) {

    }

    public String describe() {
        return "Agence: " + this.nom + ", située à " + this.ville;
    }
}