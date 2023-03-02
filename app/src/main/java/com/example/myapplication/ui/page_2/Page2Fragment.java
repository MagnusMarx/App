package com.example.myapplication.ui.page_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentPage2Binding;
public class Page2Fragment extends Fragment {

    private FragmentPage2Binding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Page2ViewModel page2ViewModel =
                new ViewModelProvider(this).get(Page2ViewModel.class);

        binding = FragmentPage2Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPage2;
        page2ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}