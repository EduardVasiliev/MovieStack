package com.example.moviestack;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.moviestack.util.Animation;
import com.example.moviestack.util.Constants;

public class ActionMovieListActivity extends AppCompatActivity {

    private Button buttonPlayMovie1;
    private Button buttonPlayMovie2;
    private Button buttonPlayMovie3;
    private Button buttonPlayMovie4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_movie_list);

        buttonPlayMovie1 = findViewById(R.id.buttonPlayMovie1);
        buttonPlayMovie2 = findViewById(R.id.buttonPlayMovie2);
        buttonPlayMovie3 = findViewById(R.id.buttonPlayMovie3);
        buttonPlayMovie4 = findViewById(R.id.buttonPlayMovie4);

        // Inception
        buttonPlayMovie1.setOnClickListener(view -> {
            Animation.press(view);
            startPlayer(Constants.ACTION_MOVIE_INCEPTION_ID);
        });

        // Blade Runner 2049
        buttonPlayMovie2.setOnClickListener(view -> {
            Animation.press(view);
            startPlayer(Constants.ACTION_MOVIE_BLADE_RUNNER_ID);
        });

        // Baby Driver
        buttonPlayMovie3.setOnClickListener(view -> {
            Animation.press(view);
            startPlayer(Constants.ACTION_MOVIE_BABY_DRIVER_ID);
        });

        // Sicario
        buttonPlayMovie4.setOnClickListener(view -> {
            Animation.press(view);
            startPlayer(Constants.ACTION_MOVIE_SICARIO_ID);
        });



    }

    private void startPlayer(String videoID) {
        Intent playerActivityIntent = new Intent(this, PlayerActivity.class);
        playerActivityIntent.putExtra(Constants.VIDEO_ID, videoID);
        startActivity(playerActivityIntent);
        overridePendingTransition(0, 0);
    }


}