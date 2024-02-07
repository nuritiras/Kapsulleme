package com.example.kapsulleme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Personel ogrenci=new Personel();
        ogrenci.setAdi("Mehmetcan");
        ogrenci.setSoyAdi("Çelik");
        ogrenci.setYas((short) -17);
        System.out.println("Adı: "+ogrenci.getAdi());
        System.out.println("Soyadı:"+ogrenci.getSoyAdi());
        System.out.println("Yaşı:"+ogrenci.getYas());

    }
}