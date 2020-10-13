package ab;

public class Agence {
    String nom;
    String ville;
    Stock stock;

    private Agence(String nom, String ville, Stock stock) {
        this.nom = nom;
        this.ville = ville;
        this.stock = stock;
    }
}