package com.example.android.musicalstructureapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class GenresActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);
        //getSupportActionBar().hide();

        //String that contains the elements of the list on GenresActivity
        String[] genres = {"Rock", "Jazz", "R'n'B", "Folk", "Dance", "Classical", "Pop"};

        //Custom Adapter for converting the ArrayList of objects into View items loaded into the ListView container
        ListAdapter sabinaAdapter = new CustomAdapter(this, genres);
        ListView genres_listView = (ListView) findViewById(R.id.genres_listView);
        genres_listView.setAdapter(sabinaAdapter);

        genres_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent playIntent = new Intent(view.getContext(), ArtistsActivity.class);
                    startActivityForResult(playIntent, 0);
                }
            }
        });

        //ImageView Intent shown as a spyglass /search icon, which takes the user back to the search screen, if clicked
        ImageView backToSearch = (ImageView) findViewById(R.id.search_tool2);
        backToSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnToSearchIntent = new Intent(GenresActivity.this, SearchActivity.class);
                startActivity(returnToSearchIntent);
            }
        });

        TextView titleGenre = (TextView) findViewById(R.id.textViewGenres);
        titleGenre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This activity shows all the genres displayed in no particular order, that the user can choose from, displayed through a ListView with data populated using an Adapter. By clicking on each type of music, the app takes the user further to a list of artists or bands, displayed in no particular order. ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

