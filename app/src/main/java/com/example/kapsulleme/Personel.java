package com.example.kapsulleme;

public class Personel {
    private int id;
    private String adi;
    private String soyAdi;
    private short yas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyAdi() {
        return "**********";
    }

    public void setSoyAdi(String soyAdi) {
        this.soyAdi = soyAdi;
    }

    public short getYas() {
        if (yas<0){
            System.out.println("Hatalı yaş girdiniz.");
            yas=0;
        }
        return yas;
    }

    public void setYas(short yas) {
        this.yas = yas;
    }
}
