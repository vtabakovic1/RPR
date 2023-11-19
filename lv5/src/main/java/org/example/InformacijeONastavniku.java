package org.example;

import java.util.ArrayList;
import java.util.List;

public class InformacijeONastavniku extends LicneInformacije {
    String titula;
    List<Ocjena> lista_ocjena;
    void setTitula(String t){
        this.titula=t;

    }
    public void ocij
    String getTitula(){
        return this.titula;
    }
    public void ocijeni(Ocjena o){
        lista_ocjena.add(o);
    }



}
