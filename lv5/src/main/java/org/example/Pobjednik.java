package org.example;

public class Pobjednik {
    String ime_prezime;
    int brojZakova;
    KolekcijaImena kolekcija_imena;
    Pobjednik( KolekcijaImena kolekcija_imena){
        String ime=kolekcija_imena.getNajduzeIme();
        this.ime_prezime=ime;
        this.brojZakova=ime.length();

    }
}
