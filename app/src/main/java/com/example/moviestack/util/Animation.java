package com.example.moviestack.util;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;

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
}
