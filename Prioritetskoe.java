class Prioritetskoe<T extends Comparable<T>> extends Lenkeliste<T> {

    @Override
    public void leggTil(T x) {
        Node nyNode = new Node(x);
        if (foerste == null) {
            foerste = nyNode;
        } else { 
            Node node = foerste;
            int forskjell = x.compareTo(node.data); // x - data
            if (forskjell <= 0) { // x er mindre eller lik data til foerste node og nyNode skal plasseres foerst
                nyNode.neste = foerste;
                foerste = nyNode;
            } else {
                int teller = 0;
                while (forskjell > 0) {
                    if (node.neste == null){
                        node.neste = nyNode;
                        return;
                    }
                    node = node.neste;
                    forskjell = x.compareTo(node.data);
                    teller++;
                }
                node = foerste;
                while (teller > 1) {
                    node = node.neste;
                    teller--;
                }
                
                nyNode.neste = node.neste;
                node.neste = nyNode;

            }
        }
    }
}