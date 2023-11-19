package org.example;

import java.util.List;

public class Predmet {
    private String naziv,opis;
    List<Ocjena> lista_ocjena;
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void ocijeni(Ocjena o){
        lista_ocjena.add(o);
    }

}
