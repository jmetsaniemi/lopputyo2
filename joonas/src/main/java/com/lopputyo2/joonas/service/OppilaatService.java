package com.lopputyo2.joonas.service;

import com.lopputyo2.joonas.data.Oppilaat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


////erilliset servicet oppilaille, joita kutsutaan maincontrollerista
@Service
public class OppilaatService {

    private List<Oppilaat> oppilaatList = new ArrayList<>();

    public void AddOppilas(Oppilaat oppilaat) {oppilaatList.add(oppilaat);}

    public List<Oppilaat> GetOppilaat(){
        return new ArrayList<>(oppilaatList);
    }

    public List<Oppilaat> getOppilaatById(int oppilaatId){
        List<Oppilaat> foundOppilaat = new ArrayList<>();

        for(Oppilaat b : oppilaatList){
            if(b.getOppilasId() == oppilaatId){
                foundOppilaat.add(b);
            }
        }
        return foundOppilaat;
    }

}
