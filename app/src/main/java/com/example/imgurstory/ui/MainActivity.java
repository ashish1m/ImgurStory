package com.example.imgurstory.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.imgurstory.ImgurStory;
import com.example.imgurstory.R;
import com.example.imgurstory.repository.remote.ImgurApi;
import com.example.imgurstory.repository.remote.model.ImgurResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getImgurStory();
    }

    private void getImgurStory() {
        ImgurApi imgurStoryService = ImgurStory.getInstance().getRetrofit().create(ImgurApi.class);
        Call<ImgurResponse> scienceTechGallery = imgurStoryService.getScienceTechGallery();
        scienceTechGallery.enqueue(new Callback<ImgurResponse>() {
            @Override
            public void onResponse(Call<ImgurResponse> call, Response<ImgurResponse> response) {

            }

            @Override
            public void onFailure(Call<ImgurResponse> call, Throwable t) {

            }
        });
    }
}
