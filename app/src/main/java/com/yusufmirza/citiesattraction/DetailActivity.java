package com.yusufmirza.citiesattraction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yusufmirza.citiesattraction.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



        Intent intent = getIntent();
        Landmark landmark= (Landmark) intent.getSerializableExtra("landmark");
        binding.placeView.setText(landmark.isim);
        binding.countryView.setText(landmark.sehir);
        binding.imageView.setImageResource(landmark.resim);



    }

    }
