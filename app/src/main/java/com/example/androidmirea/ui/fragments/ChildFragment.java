package com.example.androidmirea.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mitrofanovaviktoria.databinding.FragmentChildBinding;
import com.example.mitrofanovaviktoria.domain.Constants;

public class ChildFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentChildBinding binding = FragmentChildBinding.inflate(inflater, container, false);

        binding.sendButton.setOnClickListener(view -> {
            Bundle result = new Bundle();
            result.putString(Constants.BUNDLE_KEY, "Результат переданный от дочернего фрагмента");
            getParentFragmentManager().setFragmentResult(Constants.CHILD_REQUEST_KEY, result);
        });

        getParentFragmentManager().setFragmentResultListener(Constants.REQUEST_KEY,
                this, (requestKey, bundle) -> {
                    String result = bundle.getString(Constants.BUNDLE_KEY);
                    binding.resultTextView.setText(result);
                });

        return binding.getRoot();
    }
}