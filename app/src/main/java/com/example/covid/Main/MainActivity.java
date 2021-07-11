package com.example.covid.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.covid.Model.DetailModel;
import com.example.covid.Model.MainModel;
import com.example.covid.R;
import com.example.covid.Retrofit.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private final String TAG ="MainActivity";
    private RecyclerView rv_provinsi;
    private MainAdapter mainAdapter;
    private List<DetailModel> detailModel;
    private static MainActivity mainActivity;

    TextView positif, dirawat, sembuh, meninggal,lastUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        positif = findViewById(R.id.positif);
        dirawat = findViewById(R.id.dirawat);
        sembuh = findViewById(R.id.sembuh);
        meninggal = findViewById(R.id.meninggal);
        lastUpdate = findViewById(R.id.lastUpdate);

        rv_provinsi = findViewById(R.id.rv_provinsi);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv_provinsi.setLayoutManager(layoutManager);
        mainActivity= this;

        getMainDatafromAPI();
        getDetailDatafromAPI();
    }
    private void getMainDatafromAPI(){
        ApiService.endpoint().getMain()
                .enqueue(new Callback<MainModel>() {
                    @Override
                    public void onResponse(Call<MainModel> call, Response<MainModel> response) {
                        if (response.isSuccessful()){
                            Log.d(TAG, "onResponse: berhasil"+response.code());
                            Log.d(TAG, "onResponse: berhasil"+response.message());

                            MainModel mainModel =response.body();
                            positif.setText(Integer.toString(mainModel.getTotal().getPositif()));
                            dirawat.setText(Integer.toString(mainModel.getTotal().getDirawat()));
                            sembuh.setText(Integer.toString(mainModel.getTotal().getSembuh()));
                            meninggal.setText(Integer.toString(mainModel.getTotal().getMeninggal()));
                            lastUpdate.setText(mainModel.getTotal().getLastUpdate());
                        }

                    }

                    @Override
                    public void onFailure(Call<MainModel> call, Throwable t) {
                        Log.d(TAG, "onFailure: gagal"+t.getMessage());
                    }
                });
    }
    public void getDetailDatafromAPI(){
        ApiService.endpoint().getDetail()
                .enqueue(new Callback<List<DetailModel>>() {
                    @Override
                    public void onResponse(Call<List<DetailModel>> call, Response<List<DetailModel>> response) {
                        if (response.isSuccessful()) {
                            Log.d(TAG, "onResponse: berhasil" + response.code());
                            Log.d(TAG, "onResponse: berhasil" + response.message());

                            detailModel =response.body();
                            mainAdapter= new MainAdapter(detailModel);
                            rv_provinsi.setAdapter(mainAdapter);

                            mainAdapter.setOnItemClickCallback(new MainAdapter.OnItemClickCallback() {
                                @Override
                                public void onItemClicked(DetailModel detailModel) {
                                    showSelectedDay(detailModel);
                                }
                            });


                        }
                    }

                    @Override
                    public void onFailure(Call<List<DetailModel>> call, Throwable t) {
                        Log.d(TAG, "onFailure: gagal"+t.getMessage());

                    }
                });
    }
    private void showSelectedDay(DetailModel detailModel){
        Intent intent = new Intent (MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_PROVINSI,detailModel.getProvinsi());
        intent.putExtra(String.valueOf(DetailActivity.EXTRA_KASUS),detailModel.getKasus());
        intent.putExtra(String.valueOf(DetailActivity.EXTRA_DIRAWAT),detailModel.getDirawat());
        intent.putExtra(String.valueOf(DetailActivity.EXTRA_SEMBUH),detailModel.getSembuh());
        intent.putExtra(String.valueOf(DetailActivity.EXTRA_MENINGGAL),detailModel.getMeninggal());
        //intent.putExtra(String.valueOf(DetailActivity.EXTRA_PEREMPUAN),detailModel.getJenisKelamin().getPerempuan());
        //intent.putExtra(String.valueOf(DetailActivity.EXTRA__05),detailModel.getKelompokUmur().get05());
        //intent.putExtra(String.valueOf(DetailActivity.EXTRA_POSITIF),detailModel.getPenambahan().getPositif());
        startActivity(intent);


    }
}