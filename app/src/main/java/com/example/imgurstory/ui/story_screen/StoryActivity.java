package com.example.imgurstory.ui.story_screen;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.imgurstory.R;
import com.example.imgurstory.repository.remote.model.catagory_response.CatagoryListResponse;
import com.example.imgurstory.repository.remote.model.catagory_response.ImageData;
import com.example.imgurstory.ui.detail_screen.DetailActivity;
import com.example.imgurstory.ui.util.DownloadImageTask;
import com.example.imgurstory.ui.util.ImageLoadTimer;

import java.util.ArrayList;

public class StoryActivity extends AppCompatActivity implements View.OnClickListener, ImageLoadTimer.Observer {

    private TextView mTitleTv;
    private TextView mTimerTv;
    private ImageView mImageView;
    private ArrayList<ImageData> mImageListdata;
    private StoryViewModel mStoryViewModel;
    private ImageLoadTimer mImageLoaderTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        mStoryViewModel = new ViewModelProvider(this).get(StoryViewModel.class);
        initView();
    }

    private void initView() {
        mTitleTv = findViewById(R.id.tv_title);
        mTimerTv = findViewById(R.id.tv_timer);
        mImageView = findViewById(R.id.iv_image);

        mImageView.setOnClickListener(this);
        mStoryViewModel.getCategoryList().observe(this, new Observer<CatagoryListResponse>() {
            @Override
            public void onChanged(CatagoryListResponse catagoryListResponse) {
                mImageListdata = catagoryListResponse.getData();
                updateUI(0);
                startTimer();
            }
        });
    }

    private void startTimer() {
        if (mImageLoaderTimer != null) {
            mImageLoaderTimer.cancel();
        }
        mImageLoaderTimer = new ImageLoadTimer(mImageListdata.size());
        mImageLoaderTimer.addObserver(this);
        mImageLoaderTimer.start();
    }

    private void updateUI(int index) {
        mTitleTv.setText(mImageListdata.get(index).getTitle());
        new DownloadImageTask(new DownloadImageTask.Observer() {
            @Override
            public void onComplete(Bitmap bitmap) {
                mImageView.setImageBitmap(bitmap);
            }
        }).execute(mImageListdata.get(index).getImages().get(0).getLink());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_image:
                navigateToDetailActivity(mImageLoaderTimer.getCurrentIndex());
                break;
        }
    }

    private void navigateToDetailActivity(int currentIndex) {
        mImageLoaderTimer.cancel();
        Intent intent = new Intent(StoryActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.CURRENT_INDEX, currentIndex);
        startActivity(intent);
    }

    @Override
    public void loadNextSlide(int index) {
        updateUI(index);
    }

    @Override
    public void updateTimer(int remainingSec) {
        mTimerTv.setText(remainingSec + "s");
    }
}
