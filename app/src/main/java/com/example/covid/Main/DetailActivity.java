package com.example.covid.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import com.example.covid.R;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_PROVINSI="extra_provinsi";
    public static final String EXTRA_KASUS="extra_kasus";
    public static final String EXTRA_DIRAWAT="extra_dirawat";
    public static final String EXTRA_SEMBUH="extra_sembuh";
    public static final String EXTRA_MENINGGAL="extra_meninggal";
    public static final String EXTRA_POSITIF="extra_positif";
    public static final String EXTRA_PEREMPUAN="extra_perempuan";
    public static final String EXTRA__05="EXTRA__05";
    private TextView tvprovinsi,tvkasus,tvdirawat,tvsembuh,tvmeninggal,tvpositif,tvperempuan,tv_05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvprovinsi =findViewById(R.id.provinsi);
        tvkasus =findViewById(R.id.kasus);
        tvdirawat= findViewById(R.id.dirawat);
        tvsembuh =findViewById(R.id.sembuh);
        tvmeninggal =findViewById(R.id.meninggal);
        tvpositif = findViewById(R.id.positif);
        tvperempuan =findViewById(R.id.perempuan);
        tv_05 = findViewById(R.id._05);

        String provinsi =getIntent().getStringExtra(EXTRA_PROVINSI);
        String kasus =getIntent().getStringExtra(EXTRA_KASUS);
        String dirawat =getIntent().getStringExtra(EXTRA_DIRAWAT);
        String sembuh =getIntent().getStringExtra(EXTRA_SEMBUH);
        String meninggal =getIntent().getStringExtra(EXTRA_MENINGGAL);
        String positif =getIntent().getStringExtra(EXTRA_POSITIF);
        String perempuan =getIntent().getStringExtra(EXTRA_PEREMPUAN);
        String _05 =getIntent().getStringExtra(EXTRA__05);

        tvprovinsi.setText(provinsi);
        tvkasus.setText(kasus);
        tvdirawat.setText(dirawat);
        tvsembuh.setText(sembuh);
        tvmeninggal.setText(meninggal);
        tvpositif.setText(positif);
        tvperempuan.setText(perempuan);
        tv_05.setText(_05);

    }
}