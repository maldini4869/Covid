package com.example.covid.Model;

import com.google.gson.annotations.SerializedName;

public class Total {
    @SerializedName("positif")
    private Integer positif;
    @SerializedName("dirawat")
    private Integer dirawat;
    @SerializedName("sembuh")
    private Integer sembuh;
    @SerializedName("meninggal")
    private Integer meninggal;
    @SerializedName("lastUpdate")
    private String lastUpdate;

    public Integer getPositif() {
        return positif;
    }

    public void setPositif(Integer positif) {
        this.positif = positif;
    }

    public Integer getDirawat() {
        return dirawat;
    }

    public void setDirawat(Integer dirawat) {
        this.dirawat = dirawat;
    }

    public Integer getSembuh() {
        return sembuh;
    }

    public void setSembuh(Integer sembuh) {
        this.sembuh = sembuh;
    }

    public Integer getMeninggal() {
        return meninggal;
    }

    public void setMeninggal(Integer meninggal) {
        this.meninggal = meninggal;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
