package com.example.moviestack.util;

import android.util.Log;
import android.view.View;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubePlayer {

    private static final String API_KEY = "AIzaSyBWqnYbInDVU_k6ymdH5MgDa3cjttmlyBI";

    public void play(YouTubePlayerView playerView, String videoID) {
        System.out.println("Inside play(YouTubePlayerView player)");

        // Youtube Player Setup
        YouTubePlayer.OnInitializedListener mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                System.out.println("SUCCESS: Video initiated!");
                youTubePlayer.loadVideo(videoID);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                System.out.println("ERROR: Failed to start video!");
            }
        };

        // Initialize the video
        playerView.initialize(API_KEY, mOnInitializedListener);
    }



}
