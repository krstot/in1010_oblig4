

public class Vanedannende extends Legemiddel {
    private int vanedannende;

    public Vanedannende(String navn, int pris, double mg, int vanedannende) {
        super(navn, pris, mg); //Sender videre til Legemiddel sin kontruktor.
        this.vanedannende = vanedannende;
    }

    public int hentVanedannendeStyrke() {
        return vanedannende;
    }

    public String toString() {
        return super.toString() + "\nVanedannende: " + vanedannende;
    }
}
