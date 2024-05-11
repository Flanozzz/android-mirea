package com.example.androidmirea.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mitrofanovaviktoria.databinding.FragmentRecyclerBinding;

public class RecyclerFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentRecyclerBinding binding = FragmentRecyclerBinding.inflate(getLayoutInflater());

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
//        binding.recyclerView.setAdapter(new MyRecyclerAdapter(Constants.Items(), requireContext()));

        return binding.getRoot();
    }
}