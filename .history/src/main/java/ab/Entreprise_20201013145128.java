package ab;

public final class Entreprise {
    Agence[] agences;

    private Entreprise(Agence[] agences) {
        
        this.agences = agences;
    }

    public static void main(String[] args) {
        Agence nantes = new Agence();
        Agence rennes = new Agence();
        Agence brest = new Agence();
        Agence[] listedagences = {nantes, rennes, brest};

        Entreprise laboite = new Entreprise(listedagences);
    }
}
