package ab;

public final class Entreprise {
    Lieu[] lieux;

    private Entreprise(Lieu[] lieux) {
        
        this.lieux = lieux;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Lieu nantes = new Lieu();
        Lieu rennes = new Lieu();
        Lieu brest = new Lieu();
        Lieu[] listedelieux = {nantes, rennes, brest};
        Entreprise laboite = new Entreprise(listedelieux);
    }
}
