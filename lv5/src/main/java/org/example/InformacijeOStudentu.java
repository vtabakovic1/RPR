package org.example;

public class InformacijeOStudentu extends LicneInformacije{
    int godinaStudija;
    int brojIndexa;

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void ocijeniNastavnika(int ocjena){
        var nastavnik=new InformacijeONastavniku();

    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }
}
