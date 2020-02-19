package com.example.imgurstory.ui;

import android.widget.Toast;

import com.example.imgurstory.ImgurStory;

public class Utils {

    public static void showToast(String message) {
        Toast.makeText(ImgurStory.getInstance().getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
