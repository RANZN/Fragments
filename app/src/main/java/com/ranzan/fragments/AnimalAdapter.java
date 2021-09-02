package com.ranzan.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<AnimalData> dataList = new ArrayList<>();

    public AnimalAdapter(ArrayList<AnimalData> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AnimalData animalData = dataList.get(position);
        holder.setData(animalData);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
