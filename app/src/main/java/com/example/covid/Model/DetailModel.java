package com.example.covid.Model;

import com.google.gson.annotations.SerializedName;

public class DetailModel {
    @SerializedName("provinsi")
    private String provinsi;
    @SerializedName("kasus")
    private Integer kasus;
    @SerializedName("dirawat")
    private Integer dirawat;
    @SerializedName("sembuh")
    private Integer sembuh;
    @SerializedName("meninggal")
    private Integer meninggal;
    @SerializedName("last_date")
    private String lastDate;
    @SerializedName("jenis_kelamin")
    private JenisKelamin jenisKelamin;
    @SerializedName("kelompok_umur")
    private KelompokUmur kelompokUmur;
    @SerializedName("penambahan")
    private Penambahan penambahan;

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public Integer getKasus() {
        return kasus;
    }

    public void setKasus(Integer kasus) {
        this.kasus = kasus;
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

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public KelompokUmur getKelompokUmur() {
        return kelompokUmur;
    }

    public void setKelompokUmur(KelompokUmur kelompokUmur) {
        this.kelompokUmur = kelompokUmur;
    }

    public Penambahan getPenambahan() {
        return penambahan;
    }

    public void setPenambahan(Penambahan penambahan) {
        this.penambahan = penambahan;
    }

}
