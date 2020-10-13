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
        Agence[] listedagences = { nantes, rennes, brest };

        Entreprise laboite = new Entreprise(listedagences);

        Vehicule mazda = new Vehicule("Mazda", "rouge", 5, "essence");

        System.out.println(nantes.decrire());
    }
}
