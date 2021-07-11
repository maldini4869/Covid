package com.example.covid.Model;

import com.google.gson.annotations.SerializedName;

public class JenisKelamin {

        @SerializedName("laki-laki")
        private Integer lakilaki;
        @SerializedName("perempuan")
        private Integer perempuan;

        public Integer getLakilaki() {
            return lakilaki;
        }

        public void setLakilaki(Integer lakilaki) {
            this.lakilaki = lakilaki;
        }

        public Integer getPerempuan() {
            return perempuan;
        }

        public void setPerempuan(Integer perempuan) {
            this.perempuan = perempuan;
        }

}
