package com.example.myapplication.ui.page_4;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Page4ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Page4ViewModel() {
        mText = new MutableLiveData<>();
    }
    public LiveData<String> getText() {
        return mText;
    }

}