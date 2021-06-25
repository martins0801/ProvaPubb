package PrudenteGirolamo.Cart;

import PrudenteGirolamo.Dolci.Dolci;

public class CartItem {
    private final double peso;
    private final Dolci prodotto;
    private final String descrizione;

    public CartItem(double peso, Dolci prodotto, String descrizione) {
        this.peso = peso;
        this.prodotto = prodotto;
        this.descrizione=descrizione;
    }

    public double getPeso() {
        return peso;
    }

    public Dolci getProdotto() {
        return prodotto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getTotale(){
        return prodotto.getPrezzoAlKg()*this.peso;
    }
}
