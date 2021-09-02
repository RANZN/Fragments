package com.ranzan.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<AnimalData> animalData = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        buildData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        AnimalAdapter animalAdapter=new AnimalAdapter(animalData);
        GridLayoutManager manager=new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(animalAdapter);
    }

    private void buildData() {
        for (int i = 0; i < 100; i++) {
            animalData.add(new AnimalData("Ricky", R.drawable.dog));
        }
    }


}