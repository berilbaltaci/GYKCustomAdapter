package com.example.gykcustomadapter;

public class Kisi {

    private String isim;
    private String tarih;

    public Kisi(String isim, String tarih) {
        this.isim = isim;
        this.tarih = tarih;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
}
