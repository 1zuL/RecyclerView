package com.ijul.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MoviesRecyclerViewAdapter adapter;
    ArrayList<Movies> objMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        objMovies.add(new Movies("Tokyo Revengers", "Action, Drama, Sci-Fi","Tsutomu Hanabusa", 8.4, "A middle-aged loser travels in time to his school years, and, in order to save the love of his life from future doom, he must become the leader of a dreaded school gang.", "9 Juli 2021" ));
        objMovies.add(new Movies("Tusk", "Comedy, Drama, Horor","Kevin Smith" ,5.3,"A brash and arrogant podcaster gets more than he bargained for when he travels to Canada to interview a mysterious recluse... who has a rather disturbing fondness for walruses.", "19 September 2014" ));


        adapter = new MoviesRecyclerViewAdapter(objMovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }
}