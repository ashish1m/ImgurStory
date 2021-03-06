package com.example.imgurstory.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.imgurstory.R;
import com.example.imgurstory.ui.story_screen.StoryActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                navigateToMainActivity();
            }
        }, 3000);
    }

    private void navigateToMainActivity() {
        Intent intent = new Intent(SplashActivity.this, StoryActivity.class);
        startActivity(intent);
        finish();
    }
}
