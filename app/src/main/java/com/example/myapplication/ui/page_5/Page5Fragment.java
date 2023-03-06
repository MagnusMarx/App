package com.example.myapplication.ui.page_5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentPage5Binding;
public class Page5Fragment extends Fragment {
    private FragmentPage5Binding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Page5ViewModel page5ViewModel =
                new ViewModelProvider(this).get(Page5ViewModel.class);

        binding = FragmentPage5Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPage5;
        page5ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}