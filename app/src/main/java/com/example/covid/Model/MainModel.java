package com.example.covid.Model;

import com.google.gson.annotations.SerializedName;

public class MainModel {

    @SerializedName("total")
    private Total total;
    @SerializedName("penambahan")
    private Penambahan penambahan;

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public Penambahan getPenambahan() {
        return penambahan;
    }

    public void setPenambahan(Penambahan penambahan) {
        this.penambahan = penambahan;
    }
}
