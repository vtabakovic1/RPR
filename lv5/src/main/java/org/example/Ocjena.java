package org.example;

import java.util.List;

public class Ocjena {
    LicneInformacije osoba;
    int ocjena;


    public void setOcjena(int ocjena) {
        if(this.ocjena>-1 && ocjena<11){
            this.ocjena = ocjena;
        }
        else {
            throw new IllegalArgumentException();
        }

    }
    Ocjena(LicneInformacije osoba, int ocjena){
        this.osoba=osoba;
        setOcjena(ocjena);
    }
}
