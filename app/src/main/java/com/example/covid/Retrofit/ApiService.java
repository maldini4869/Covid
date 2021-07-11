package com.example.covid.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {

    private static String Base_URL = "https://apicovid19indonesia-v2.vercel.app/";
    private static Retrofit retrofit ;
    public static ApiEndpoint endpoint () {
        retrofit = new Retrofit.Builder()
                .baseUrl(Base_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ApiEndpoint.class);
    }
}
