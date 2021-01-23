package com.example.moviestack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

import com.example.moviestack.util.Animation;

public class MainActivity extends AppCompatActivity {

    private CardView cardAction;
    private CardView cardDrama;
    private CardView cardComedy;
    private CardView cardAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardAction = findViewById(R.id.cardAction);
        cardDrama = findViewById(R.id.cardDrama);
        cardComedy = findViewById(R.id.cardComedy);
        cardAnimation = findViewById(R.id.cardAnimation);

        animateCards();

        cardAction.setOnClickListener(view -> {
            openActionMovieListActivity();
        });

        cardDrama.setOnClickListener(view -> {
            openDramaMovieListActivity();
        });

        cardComedy.setOnClickListener(view -> {
            openComedyMovieListActivity();
        });

        cardAnimation.setOnClickListener(view -> {
            openAnimationMovieListActivity();
        });


    }

    private void openActionMovieListActivity() {
        Intent intent = new Intent(this, ActionMovieListActivity.class);
        startActivity(intent);
    }

    private void openDramaMovieListActivity() {
        Intent intent = new Intent(this, DramaMovieListActivity.class);
        startActivity(intent);
    }


    private void openComedyMovieListActivity() {
        Intent intent = new Intent(this, ComedyMovieListActivity.class);
        startActivity(intent);
    }

    private void openAnimationMovieListActivity() {
        Intent intent = new Intent(this, AnimationMovieListActivity.class);
        startActivity(intent);
    }

    private void animateCards() {
        Animation.slideY(cardAction, -100.0f, 500, 200, new DecelerateInterpolator());
        Animation.slideX(cardDrama, 100.0f, 500, 300, new DecelerateInterpolator());
        Animation.slideY(cardAnimation, 100.0f, 500, 400, new DecelerateInterpolator());
        Animation.slideX(cardComedy, -100.0f, 500, 500, new DecelerateInterpolator());
    }


}