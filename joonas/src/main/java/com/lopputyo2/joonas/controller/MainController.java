package com.lopputyo2.joonas.controller;

import com.lopputyo2.joonas.data.Oppilaat;
import com.lopputyo2.joonas.service.OppilaatService;
import com.lopputyo2.joonas.data.Kurssit;
import com.lopputyo2.joonas.service.KurssiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


//Pääkontrolleri, josta mappaukset

public class MainController {


    //automaattisesti löytää kurssiservices & myoppilaatservicet

    //kannattaa avata esim. selaimesta tuo http://localhost:8080/Main.html, jotta pääsee käsiksi "Käyttöliittymään"
    //tässä esimerkissä ei ole nyt hardcoodattu mitään olioita listoille, mutta käyttöliittymän kautta pääsee lisäämään opettajia ja kursseja
    //
    @Autowired
    KurssiService myKurssiService;
    @Autowired
    OppilaatService myOppilaatService;


    @GetMapping("kurssit")
    public List<Kurssit> getKurssit(){

        return myKurssiService.GetKurssi();
    }

    @GetMapping("kurssi/{kurssiId}")
    public List<Kurssit> getKurssiById(@PathVariable int kurssiId){
        return myKurssiService.getKurssiById(kurssiId);
    }

    @PostMapping("addKurssi")
    public String addKurssi(@RequestBody Kurssit kurssi){
        myKurssiService.AddKurssi(kurssi);
        return "Lisäys onnistui";
    }

    @PostMapping("addKurssiInfo")
    public String addKurssiInfo(@RequestParam String kurssiNimi, @RequestParam String kurssiOpettaja, int kurssiId) {
        myKurssiService.AddKurssi(new Kurssit(kurssiNimi, kurssiOpettaja, kurssiId));
        return "Lisäys onnistui";
    }

    @GetMapping("oppilaat")
    public List<Oppilaat> getOppilaat() {return myOppilaatService.GetOppilaat();}

    @GetMapping("oppilaat/{oppilasId}")
    public List<Oppilaat> getOppilaatById(@PathVariable int oppilasId) {return myOppilaatService.getOppilaatById(oppilasId);}

    @PostMapping("addOppilas")
    public String addOppilas(@RequestBody Oppilaat oppilaat){
        myOppilaatService.AddOppilas(oppilaat);
        return "onnistui";
    }

    @PostMapping("addOppilasInfo")
    public String addOppilasInfo(@RequestParam String fname, @RequestParam String lname, @RequestParam int oppilasId){
        myOppilaatService.AddOppilas(new Oppilaat(fname, lname, oppilasId));
        return "onnistui";
    }
}

