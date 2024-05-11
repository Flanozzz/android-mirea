package com.example.androidmirea.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mitrofanovaviktoria.databinding.FragmentChild2Binding;
import com.example.mitrofanovaviktoria.domain.Constants;

public class ChildFragment2 extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentChild2Binding binding = FragmentChild2Binding.inflate(getLayoutInflater());

        binding.sendButton.setOnClickListener(view -> {
            Bundle result = new Bundle();
            result.putString(Constants.BUNDLE_KEY, "Результат от нижнего фрагмента");
            getParentFragmentManager().setFragmentResult(
                    Constants.REQUEST_KEY, result);
        });

        return binding.getRoot();
    }
}