package com.yusufmirza.citiesattraction;

import java.io.Serializable;

public class Landmark implements Serializable {

    String isim,sehir;
    int resim;

    public Landmark(String isim,String sehir, int resim) {
        this.isim=isim;
        this.sehir=sehir;
        this.resim=resim;

    }

}
