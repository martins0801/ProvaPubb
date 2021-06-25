package PrudenteGirolamo.Dolci;

import PrudenteGirolamo.Tipologia.Tipologia;

public class Dolci {

    private double prezzoAlKg;
    private String descrizione,nome,tempoCottura,tempoConservazione;
    private int codice;
    private Tipologia tipologia;

    public Dolci() {
        super();
    }

    public double getPrezzoAlKg() {
        return prezzoAlKg;
    }

    public void setPrezzoAlKg(double prezzoAlKg) {
        this.prezzoAlKg = prezzoAlKg;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTempoCottura() {
        return tempoCottura;
    }

    public void setTempoCottura(String tempoCottura) {
        this.tempoCottura = tempoCottura;
    }

    public String getTempoConservazione() {
        return tempoConservazione;
    }

    public void setTempoConservazione(String tempoConservazione) {
        this.tempoConservazione = tempoConservazione;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }

    public void setTipologia(Tipologia tipologia) {
        this.tipologia = tipologia;
    }
}
