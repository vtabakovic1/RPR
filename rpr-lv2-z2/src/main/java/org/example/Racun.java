package org.example;

public class Racun {
    private Long broj_racuna;
    private Osoba korisnik_racuna;
    private boolean odobrenjePrekoracenja;
    private double stanjeRacuna;
    private double prekoracenje;
    public Racun(Long broj_racuna,Osoba korisnik_racuna){
        this.broj_racuna=broj_racuna;
        this.korisnik_racuna=korisnik_racuna;
    }
    private boolean provjeriOdobrenjePrekoracenja(Double iznos) {
        return prekoracenje > iznos;
    }
    public boolean izvrsiUplatu(Double uplata) {
        stanjeRacuna = stanjeRacuna + uplata;
        return true;
    }
    public boolean izvrsiIsplatu(Double isplata) {
        if(stanjeRacuna + prekoracenje < isplata) return false;
        stanjeRacuna = stanjeRacuna - isplata;
        return true;
    }
    public void odobriPrekoracenje (Double iznos) {
        prekoracenje=iznos;
        odobrenjePrekoracenja=true;
    }

}
