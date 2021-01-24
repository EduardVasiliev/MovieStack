package com.example.moviestack;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.moviestack.util.Animation;
import com.example.moviestack.util.Constants;

public class ComedyMovieListActivity extends AppCompatActivity {

    private Button buttonPlayMovie1;
    private Button buttonPlayMovie2;
    private Button buttonPlayMovie3;
    private Button buttonPlayMovie4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comedy_movie_list);

        buttonPlayMovie1 = findViewById(R.id.buttonPlayMovie1);
        buttonPlayMovie2 = findViewById(R.id.buttonPlayMovie2);
        buttonPlayMovie3 = findViewById(R.id.buttonPlayMovie3);
        buttonPlayMovie4 = findViewById(R.id.buttonPlayMovie4);

        // Friends
        buttonPlayMovie1.setOnClickListener(view -> {
            Animation.press(view);
            startPlayer(Constants.COMEDY_MOVIE_FRIENDS_ID);
        });

        // Suits
        buttonPlayMovie2.setOnClickListener(view -> {
            Animation.press(view);
            startPlayer(Constants.COMEDY_MOVIE_SUITS_ID);
        });

        // Knives Out
        buttonPlayMovie3.setOnClickListener(view -> {
            Animation.press(view);
            startPlayer(Constants.COMEDY_MOVIE_KNIVES_OUT_ID);
        });

        // Casual
        buttonPlayMovie4.setOnClickListener(view -> {
            Animation.press(view);
            startPlayer(Constants.COMEDY_MOVIE_CASUAL_ID);
        });



    }

    private void startPlayer(String videoID) {
        Intent playerActivityIntent = new Intent(this, PlayerActivity.class);
        playerActivityIntent.putExtra(Constants.VIDEO_ID, videoID);
        startActivity(playerActivityIntent);
        overridePendingTransition(0, 0);
    }


}