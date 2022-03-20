package com.lopputyo2.joonas.data;

import java.util.List;


//Kurssit luokka, jossa getterit ja setterit sekä constructorit kurssit luokan muuttjille

public class Kurssit {
    private String kurssiNimi;
    private String kurssiOpettaja;
    private int kurssiId;

    private static int count = 0;

    public Kurssit ( String kurssiNimi, String kurssiOpettaja, int kurssiId){
        this.kurssiNimi = kurssiNimi;
        this.kurssiOpettaja = kurssiOpettaja;
        this.kurssiId = kurssiId;
    }



    public Kurssit(){
        this.kurssiNimi = "";
        this.kurssiOpettaja = "";
        this.kurssiId = count++;
    }


    public String getKurssiNimi() {
        return kurssiNimi;
    }

    public void setKurssiNimi(String kurssiNimi) {
        this.kurssiNimi = kurssiNimi;
    }

    public String getKurssiOpettaja() {
        return kurssiOpettaja;
    }

    public void setKurssiOpettaja(String kurssiOpettaja) {
        this.kurssiOpettaja = kurssiOpettaja;
    }

    public int getKurssiId() {
        return kurssiId+count;
    }

}
