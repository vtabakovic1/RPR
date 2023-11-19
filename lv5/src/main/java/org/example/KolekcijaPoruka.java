package org.example;

import java.util.ArrayList;
import java.util.List;

interface Predstavljanje {
    String predstavi();
}
public class KolekcijaPoruka {
    List<String> poruke;
    List<String> GetPoruke(){
        return this.poruke;
    }

    KolekcijaPoruka (List<Predstavljanje>lista){
        this.poruke = new ArrayList<>();
        for(int i=0;i< lista.size();i++)
            poruke.add(lista.get(i).predstavi());

    }


}
