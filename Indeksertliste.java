class IndeksertListe<T> extends Lenkeliste<T> {
    
    public void leggTil(int pos, T x) {
        Node nyNode = new Node(x);
        int teller = 0;
        Node node = foerste;

        if (pos == stoerrelse()){ // legg til bakerst 
            super.leggTil(x);
        } else if (pos == 0) { // legg til forst
            nyNode.neste = foerste;
            foerste = nyNode;
        } else if (0<pos && pos<stoerrelse()) { 
            while (teller != pos-1) {
                node = node.neste;
                teller++;
            }
            
            Node nyNeste = node.neste; 
            nyNode.neste = nyNeste;
            node.neste = nyNode;

        } else { //feil index
            throw new UgyldigListeindeks(pos);
        }

    }
    public void sett(int pos, T x) {
        Node nyNode = new Node(x);
        int teller = 0;
        Node node = foerste;

        if (pos == 0) {
            nyNode.neste = node.neste;
            foerste = nyNode;
        } else if (pos > 0 && pos < stoerrelse()) {

            while (teller != pos-1) {
                node = node.neste;
                teller++;
            }
            Node foer = node; 
            node = node.neste; 
            nyNode.neste = node.neste; 
            foer.neste = nyNode; 
        } else { //feil index
            throw new UgyldigListeindeks(pos);
        } 
    }
    
    public T hent(int pos) {
        int teller = 0;
        Node node = foerste;

        if (0<=pos && pos < stoerrelse()) {
            while (teller != pos) {
                node = node.neste;
                teller++;
            }
            return node.data;
        } else { throw new UgyldigListeindeks(pos); }
    }

    public T fjern(int pos) {
        int teller = 0;
        Node node = foerste;

        if (pos==0) {
            return fjern();
        } else if (0<=pos && pos < stoerrelse()) {
            while (teller != pos-1) {
                node = node.neste;
                teller++;
            }
            Node foer = node;
            node = node.neste;
            foer.neste = node.neste;
            return node.data;
        } else { throw new UgyldigListeindeks(pos); }
    }
}