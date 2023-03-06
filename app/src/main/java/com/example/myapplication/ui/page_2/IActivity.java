//package com.example.myapplication.ui.page_2;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.annotation.SuppressLint;
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.GridView;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.example.myapplication.R;
//
//public class IActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_page2);
//
//        Intent i = getIntent();
//        int position = i.getExtras().getInt("id");
//        ImageAdapter imageAdapter = new ImageAdapter(this);
//        ImageView imageView = (ImageView) findViewById(R.id.SingleView);
//        imageView.setImageResource(imageAdapter.mThumbIds[position]);
//
//
//    }
//}