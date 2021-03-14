package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] favoriteTVShows = {"Pushing Daisies", "Better Off Ted",
                "Twin Peaks", "Freaks and Geeks", "Orphan Black", "Walking",
                "Breaking Bad", "The 400", "Alphas", "Life on Mars"};

       // MyListAdapter myListAdapter = new MyListAdapter(getResources().getStringArray(R.array.flower_array));
        MyListAdapter myListAdapter = new MyListAdapter(this, favoriteTVShows);
        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setAdapter(myListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
