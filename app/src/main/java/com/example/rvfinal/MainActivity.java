package com.example.rvfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //variabel

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

    }

        private void initImageBitmaps() {

        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://i.pinimg.com/originals/f3/00/d9/f300d98bcd1ebd3348bd8bd06e0662cb.jpg");
        mNames.add("Viriyadhi_Sidharta");

        mImageUrls.add("https://pfpmaker.com/_nuxt/img/profile-3-1.3e702c5.png");
        mNames.add("Vincent_Setiawan");

        mImageUrls.add("https://i.imgur.com/BJes1uq.jpg");
        mNames.add("Mike_Wazowski");

              initRecyclerView();
    }
      private  void initRecyclerView () {
        Log.d(TAG, "initRecyclerView: init recyclerview.");
          RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
          RecyclerViewAdapter adapter = new RecyclerViewAdapter( this , mNames , mImageUrls)     ;
          recyclerView.setAdapter(adapter);
          recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}