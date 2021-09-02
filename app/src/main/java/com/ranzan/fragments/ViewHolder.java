package com.ranzan.fragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvName;
    private ImageView mIvAnimal;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);

    }

    private void initViews(View view) {
        mTvName = view.findViewById(R.id.tvName);
        mIvAnimal = view.findViewById(R.id.ivAnimal);
    }

    public void setData(AnimalData animalData) {
        mTvName.setText(animalData.getName());
        mIvAnimal.setImageResource(animalData.getImage());
    }
}
