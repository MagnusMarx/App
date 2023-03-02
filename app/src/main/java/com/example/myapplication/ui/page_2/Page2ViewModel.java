package com.example.myapplication.ui.page_2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Page2ViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public Page2ViewModel(){
        mText = new MutableLiveData<>();

// manipulate string data from Java
//        mText.setValue("Adam Amir");
    }

    public LiveData<String> getText() {
        return mText;
    }

}