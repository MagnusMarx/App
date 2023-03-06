package com.example.myapplication.ui.page_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentPage4Binding;
public class Page4Fragment extends Fragment {
    private FragmentPage4Binding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Page4ViewModel page4ViewModel =
                new ViewModelProvider(this).get(Page4ViewModel.class);

        binding = FragmentPage4Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPage4;
        page4ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}