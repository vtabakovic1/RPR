package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class ListaBrojeva {
    private static List<Double> l;
    public ListaBrojeva() {
        l = new ArrayList<>();
    }
    /**
     * Funkcija za unos brojeva i njihovo spremanje u listu
     */
    public void unosBrojeva() {
        for(;;) {
            System.out.println("Unesite broj: (stop za kraj, decimalne brojeve unositi sa ',' a ne '.')");
            Scanner ulaz = new Scanner (System.in);
            if (ulaz.hasNextDouble()) { // Provjera da li je unesen broj
                l.add(ulaz.nextDouble());
            }
            else {
                String rijec=ulaz.nextLine(); // Ako je unesena rijec "stop" unos se zavrsava
                if(rijec.equals("stop")) break;
                else System.out.println("Pogresan unos, unesite opet");
            }
        }
    }
    /**
     * Funckija koja pronalazi najmanji element u listi
     */
    public Double nadjiMinimalniElement() {
        Double min = new Double(l.get(0));
        for(int i = 1; i < l.size(); i++)  {
            if(l.get(i)<min) min=l.get(i);
        }
        return min;
    }
    /**
     * Funckija koja pronalazi najveći element u listi
     */
    public Double nadjiMaksimalniElement() {
        Double max = new Double(l.get(0));
        for(int i = 1; i < l.size(); i++)  {
            if(l.get(i)>max) max=l.get(i);
        }
        return max;
    }
    /**
     * Funckija za racunanje srednje vrijednosti svih elemenata u nizu
     */
    public Double nadjiSrednjuVrijednost() {
        Double suma = new Double(0);
        for(int i = 0; i < l.size(); i++) suma = suma + l.get(i);
        return suma/l.size();
    }
    /**
     * Funckija za računanje standardne devijacije
     */
    public Double nadjiStandardnuDevijaciju() {
        Double standardna_devijacija= new Double(0);
        Double srednja_vrijednost = new Double(nadjiSrednjuVrijednost());
        for(int i = 0; i < l.size(); i++) {
            standardna_devijacija = standardna_devijacija + Math.pow(l.get(i) - srednja_vrijednost, 2);
        }
        return Math.sqrt(standardna_devijacija/l.size());
    }

}