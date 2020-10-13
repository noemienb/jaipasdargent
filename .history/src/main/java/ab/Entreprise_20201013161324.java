package ab;

public final class Entreprise {
    Agence[] agences;

    private Entreprise(Agence[] agences) {

        this.agences = agences;
    }

    public static void main(String[] args) {
        Agence nantes = new Agence("Agence de la Gare", "Nantes");
        Agence rennes = new Agence("Agence d'osef", "Rennes");
        Agence brest = new Agence("Agence de Balek", "Brest");

        Vehicule mazda = new Vehicule("Mazda", "rouge", 5, "essence");
        nantes.ajouterVoiture(mazda);
        System.out.println(nantes.afficherStock());

        System.out.println(nantes.decrire());
    }
}
