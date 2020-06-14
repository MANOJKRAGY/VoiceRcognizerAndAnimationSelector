package com.example.voiceanimationchildapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class AnimationActivity extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        lottieAnimationView = findViewById(R.id.animation);
        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
       if(text.equals("dog")) {
           lottieAnimationView.setAnimation("dog.json");
           lottieAnimationView.playAnimation();
           lottieAnimationView.loop(true);
       }else if(text.equals("cat")){
           lottieAnimationView.setAnimation("data.json");
           lottieAnimationView.playAnimation();
           lottieAnimationView.loop(true);
       }else{
           lottieAnimationView.setAnimation("elephant.json");
           lottieAnimationView.playAnimation();
           lottieAnimationView.loop(true);
       }
    }
}
