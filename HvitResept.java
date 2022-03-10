
public class HvitResept extends Resept {
    
    public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    @Override
    public String farge() {return "Hvit";}

    @Override
    public int prisAaBetale() { //Kun hvis det er en instans av HvitResept og ikke subklassene.
        return legemiddel.hentPris();
    }

    @Override
    public String toString() {
        return super.toString()
        + "\nType/Farge: " + farge()
        + "\nPris: " + prisAaBetale() + "kr";
    }
}
