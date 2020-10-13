package ab;

import java.util.HashMap;

public class Agence {
    String nom;
    String ville;
    HashMap<String, Vehicule> stock;

    public Agence(String nom, String ville) {
        this.nom = nom;
        this.ville = ville;
        this.stock = new HashMap<String, Vehicule>();
    }

    public void louer(Vehicule vehicule) {

    }

    public void ajouterVoiture(String id, Vehicule vehicule) {
        this.stock.set(id, vehicule);
    }

    public String decrire() {
        return "Agence: " + this.nom + ", située à " + this.ville;
    }
}