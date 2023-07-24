package com.yusufmirza.citiesattraction;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yusufmirza.citiesattraction.databinding.LandmarkBinding;

import java.util.ArrayList;

public class LandmarkRecylcle extends RecyclerView.Adapter<LandmarkRecylcle.RecycleViewHolder>{
    ArrayList<Landmark> mekanlar;

    public LandmarkRecylcle(ArrayList<Landmark> mekanlar) {
        this.mekanlar=mekanlar;
    }



    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LandmarkBinding binding = LandmarkBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new RecycleViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {
      holder.landmarkBinding.textView.setText(mekanlar.get(position).isim);

      holder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
              intent.putExtra("landmark",mekanlar.get(position));
              holder.itemView.getContext().startActivity(intent);
          }
      });



    }

    @Override
    public int getItemCount() {
        return mekanlar.size();
    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder {

        private LandmarkBinding landmarkBinding;

        public RecycleViewHolder(LandmarkBinding landmarkBinding) {
            super(landmarkBinding.getRoot());
            this.landmarkBinding=landmarkBinding;

        }


    }

}
