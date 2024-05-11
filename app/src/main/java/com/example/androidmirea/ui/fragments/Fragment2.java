package com.example.androidmirea.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.mitrofanovaviktoria.databinding.Fragment2Binding;
import com.example.mitrofanovaviktoria.domain.Constants;

public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Fragment2Binding binding = Fragment2Binding.inflate(getLayoutInflater());

        Bundle bundle = getArguments();
        if (bundle != null) {
            binding.dataTextView.setText(bundle.getString(Constants.BUNDLE_STRING_KEY));
        }

//        binding.navButton.setOnClickListener(view -> {
//            Navigation.findNavController(view).navigate(R.id.action_fragment2_to_fragment3);
//        });

        return binding.getRoot();
    }
}