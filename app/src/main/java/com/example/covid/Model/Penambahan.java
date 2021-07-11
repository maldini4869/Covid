package com.example.covid.Model;

import com.google.gson.annotations.SerializedName;

public class Penambahan {

    @SerializedName("positif")
    private Integer positif;
    @SerializedName("dirawat")
    private Integer dirawat;
    @SerializedName("sembuh")
    private Integer sembuh;
    @SerializedName("meninggal")
    private Integer meninggal;
    @SerializedName("tanggal")
    private String tanggal;
    @SerializedName("created")
    private String created;

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

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

}