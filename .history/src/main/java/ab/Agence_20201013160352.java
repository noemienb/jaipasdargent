package ab;

import java.util.ArrayList;
import java.util.HashMap;

public class Agence {
    String nom;
    String ville;
    ArrayList<Vehicule> stock;

    public Agence(String nom, String ville) {
        this.nom = nom;
        this.ville = ville;
        this.stock = new ArrayList<Vehicule>();
    }

    public void louer(Vehicule vehicule) {

    }

    public void ajouterVoiture(Vehicule vehicule) {
        this.stock.add(vehicule);
    }

    public String decrire() {
        return "Agence: " + this.nom + ", située à " + this.ville;
    }
}