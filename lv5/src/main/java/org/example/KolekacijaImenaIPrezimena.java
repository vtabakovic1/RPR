package org.example;
import java.util.List;
public class KolekacijaImenaIPrezimena {
    List<String> ime;
    List<String> prezime;
    int getIndexNajduzegPara(){
        String pomcni=" ";
        int indeks=0;
        for(int i=0;i<ime.size();i++){
            String naziv=ime.get(i)+prezime.get(i);
            if(naziv.length()>pomcni.length()){
                pomcni=naziv;
                indeks=i;

            }

        }
        return indeks;

    }

    String getImeiPrezime(int i){
        String pomocni=ime.get(i)+prezime.get(i);
        return pomocni;
    }

}
