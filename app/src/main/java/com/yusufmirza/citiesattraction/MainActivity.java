package com.yusufmirza.citiesattraction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.yusufmirza.citiesattraction.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    ArrayList<Landmark> mekanlar;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        mekanlar = new ArrayList<>();

        Landmark ist = new Landmark("Ayasofya", "İstanbul", R.drawable.img);
        Landmark ank = new Landmark("Anıtkabir", "Ankara", R.drawable.img_1);
        Landmark izm = new Landmark("Efes", "İzmir", R.drawable.img_2);
        Landmark trb = new Landmark("Sümela Manastırı", "Trabzon", R.drawable.img_3);

        mekanlar.add(ist);
        mekanlar.add(ank);
        mekanlar.add(izm);
        mekanlar.add(trb);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
       LandmarkRecylcle landmarker = new LandmarkRecylcle(mekanlar);
       binding.recyclerView.setAdapter(landmarker);

    }
}