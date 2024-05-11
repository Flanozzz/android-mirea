package com.example.androidmirea.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.mitrofanovaviktoria.databinding.Fragment3Binding;

public class Fragment3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Fragment3Binding binding = Fragment3Binding.inflate(getLayoutInflater());

//        binding.navButton.setOnClickListener(view -> {
//            Navigation.findNavController(view).navigate(R.id.action_fragment3_to_fragment1);
//        });

        return binding.getRoot();
    }
}