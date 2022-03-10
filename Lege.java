
//Del C
public class Lege {
    protected String navn;

    public Lege(String navn) {
        this.navn = navn;
    }

    public String hentNavn() {return navn;}

    @Override
    public String toString() {
        return "\n__Lege__\nNavn: Dr." + navn;
    }
}
