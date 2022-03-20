package com.lopputyo2.joonas.service;

import com.lopputyo2.joonas.data.Kurssit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//erilliset servicet kursseille, joita kutsutaan maincontrollerista
@Service
public class KurssiService {

    //luodaan Arraylisti Kurssit luokan muuttjista, eli käytännössä object array list, johon voidaan tallentaa ja josta voidaan lukea tietoja
    private List<Kurssit> kurssitList = new ArrayList<>();



    public void AddKurssi(Kurssit kurssit){
        kurssitList.add(kurssit);
    }

    public List<Kurssit> GetKurssi(){
        return new ArrayList<>(kurssitList);
    }

    public List<Kurssit> getKurssiById(int kurssiId){
        List<Kurssit> foundKurssit = new ArrayList<>();

        for(Kurssit b : kurssitList){
            if( b.getKurssiId() == kurssiId ){
                foundKurssit.add(b);
            }
        }

        return foundKurssit;

    }

}
