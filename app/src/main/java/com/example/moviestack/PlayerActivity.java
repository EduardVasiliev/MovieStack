package com.example.moviestack;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.moviestack.R;
import com.example.moviestack.util.Constants;
import com.example.moviestack.util.YoutubePlayer;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayerView;

public class PlayerActivity extends YouTubeBaseActivity {

    private YouTubePlayerView playerView;
    private String videoID;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_player);

        Intent intent = getIntent();

        playerView = findViewById(R.id.youtubePlayerView);
        videoID = intent.getStringExtra(Constants.VIDEO_ID);

        YoutubePlayer youtubePlayer = new YoutubePlayer();
        youtubePlayer.play(playerView, videoID);
    }

}
