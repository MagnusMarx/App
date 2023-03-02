package com.example.myapplication.ui.page_3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Page3ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Page3ViewModel() {
        mText = new MutableLiveData<>();
    }
    public LiveData<String> getText() {
        return mText;
    }

}