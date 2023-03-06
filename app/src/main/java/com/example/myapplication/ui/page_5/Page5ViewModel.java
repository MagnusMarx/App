package com.example.myapplication.ui.page_5;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Page5ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Page5ViewModel() {
        mText = new MutableLiveData<>();
    }
    public LiveData<String> getText() {
        return mText;
    }

}