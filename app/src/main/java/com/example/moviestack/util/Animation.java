package com.example.moviestack.util;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;

public class Animation {

    public static void changeAlpha(View view, float initValue, float finValue,
                                    int duration, int delay, Interpolator i) {

        android.view.animation.Animation a1 = new AlphaAnimation(initValue, finValue);
        a1.setDuration(duration);
        a1.setStartOffset(delay);
        view.startAnimation(a1);
    }


    public static void slideX(View view, float value, int duration, int delay, Interpolator i) {
        view.setTranslationX(-value);
        ObjectAnimator translationX = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, 0);
        translationX.setDuration(duration);
        translationX.setStartDelay(delay);
        translationX.setInterpolator(i);
        changeAlpha(view, 0.0f, 1.0f, duration/2, delay, i);
        translationX.start();
    }

    public static void slideY(View view, float value, int duration, int delay, Interpolator i) {
        view.setTranslationY(-value);
        ObjectAnimator translationY = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0);
        translationY.setDuration(duration);
        translationY.setStartDelay(delay);
        translationY.setInterpolator(i);;
        changeAlpha(view, 0.0f, 1.0f, duration/2, delay, i);
        translationY.start();
    }

    public static void press(View view) {
        ObjectAnimator goDown = ObjectAnimator.ofPropertyValuesHolder(view,
                PropertyValuesHolder.ofFloat(View.SCALE_X, 1.0f, 0.90f),
                PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.0f, 0.90f));
        goDown.setDuration(250);
        goDown.setStartDelay(0);
        goDown.setInterpolator(new AccelerateInterpolator());

        ObjectAnimator goUp = ObjectAnimator.ofPropertyValuesHolder(view,
                PropertyValuesHolder.ofFloat(View.SCALE_X, 0.90f, 1.0f),
                PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.90f, 1.0f));
        goUp.setDuration(250);
        goUp.setStartDelay(250);
        goUp.setInterpolator(new OvershootInterpolator());

        goDown.start();
        goUp.start();
    }
}
