package com.example.covid.Retrofit;

import com.example.covid.Model.MainModel;
import com.example.covid.Model.DetailModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpoint {

    @GET("api/indonesia/provinsi")
    Call<List<DetailModel>> getDetail();
    @GET("api/indonesia/more")
    Call<MainModel>getMain();
}
