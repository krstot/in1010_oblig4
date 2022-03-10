

public class Narkotisk extends Legemiddel {
    private int styrke;

    public Narkotisk(String navn, int pris, double mg, int styrke) {
        super(navn, pris, mg); //Sender videre til Legemiddel sin kontruktor.
        this.styrke = styrke;
    }

    public int hentNarkotiskStyrke() {
        return styrke;
    }

    public String toString() {
        return super.toString() + "\nNarkotisk styrke: " + styrke;
    }
}