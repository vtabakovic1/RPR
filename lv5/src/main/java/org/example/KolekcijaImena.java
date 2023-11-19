package org.example;

import java.util.ArrayList;
import java.util.List;

public class KolekcijaImena {
    List<String> nazivi;
    String getNajduzeIme(){

        int indeks=0;
        String pomocna=" ";

        for(int i=0;i<nazivi.size();i++){
            for(int j=0;j<nazivi.get(i).length();j++){
                if(nazivi.get(i).charAt(j)== ' '){

                    indeks=i;
                    break;
                }
            }
            String izdvojeni=nazivi.get(i).substring(0,indeks);
            if(izdvojeni.length()>pomocna.length()){
                pomocna=izdvojeni;
            }


        }
        return pomocna;


     }



}
