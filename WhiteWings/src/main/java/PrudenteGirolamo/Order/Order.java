package PrudenteGirolamo.Order;

import PrudenteGirolamo.Cart.Cart;
import PrudenteGirolamo.Utente.Utente;

import java.util.GregorianCalendar;

public class Order {

    private int idOrdine, quantità;
    private double totaleOrdine;
    private GregorianCalendar dataOrdine;
    private Utente utente;
    private Cart cart;

    public Order() {
        super();
    }

    public int getIdOrdine() {
        return idOrdine;
    }

    public void setIdOrdine(int idOrdine) {
        this.idOrdine = idOrdine;
    }

    public int getQuantità() {
        return quantità;
    }

    public void setQuantità(int quantità) {
        this.quantità = quantità;
    }

    public double getTotaleOrdine() {
        return totaleOrdine;
    }

    public void setTotaleOrdine(double totaleOrdine) {
        this.totaleOrdine = totaleOrdine;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
}
