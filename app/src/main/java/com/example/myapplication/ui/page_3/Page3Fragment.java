package com.example.myapplication.ui.page_3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentPage3Binding;
public class Page3Fragment extends Fragment {
    private FragmentPage3Binding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Page3ViewModel page3ViewModel =
                new ViewModelProvider(this).get(Page3ViewModel.class);

        binding = FragmentPage3Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPage3;
        page3ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}