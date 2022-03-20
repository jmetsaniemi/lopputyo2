package com.lopputyo2.joonas.data;


//oppilaat luokka, jossa getterit, setterit ja constructorit oppilaat luokan muuttujille

public class Oppilaat {
    private String fname;
    private String lname;
    private int oppilasId;

    private static int count = 0;

    public Oppilaat(String fname, String lname, int oppilasId) {
        this.fname = fname;
        this.lname = lname;
        this.oppilasId = oppilasId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getOppilasId() {
        return oppilasId;
    }

    public void setOppilasId(int oppilasId) {
        this.oppilasId = oppilasId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Oppilaat.count = count;
    }
}