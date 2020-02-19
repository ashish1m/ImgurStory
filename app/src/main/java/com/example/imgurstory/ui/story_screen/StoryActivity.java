package com.example.imgurstory.ui.story_screen;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.imgurstory.R;
import com.example.imgurstory.repository.remote.model.catagory_response.CatagoryListResponse;
import com.example.imgurstory.repository.remote.model.catagory_response.ImageListData;
import com.example.imgurstory.ui.DownloadImageTask;
import com.example.imgurstory.ui.detail_screen.DetailActivity;

import java.util.ArrayList;

public class StoryActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTitleTv;
    private TextView mTimerTv;
    private ImageView mImageView;
    private ArrayList<ImageListData> mImageListdata;
    private CountDownTimer countDownTimer;
    private StoryViewModel mStoryViewModel;

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
                updateUI();
            }
        });
    }

    private void updateUI() {
        new DownloadImageTask(new DownloadImageTask.Observer() {
            @Override
            public void onComplete(Bitmap bitmap) {
                mImageView.setImageBitmap(bitmap);
            }
        }).execute(mImageListdata.get(0).getImages().get(0).getLink());
        mTitleTv.setText(mImageListdata.get(0).getTitle());
        mTimerTv.setText("4s");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_image:
                navigateToDetailActivity();
                break;
        }
    }

    private void navigateToDetailActivity() {
        Intent intent = new Intent(StoryActivity.this, DetailActivity.class);
        startActivity(intent);
    }

    private static class ImageLoadTimer extends CountDownTimer {
        public ImageLoadTimer() {
            super(1 * 4 * 1000, 1000);
        }

        @Override
        public void onTick(long millisUntilFinished) {

        }

        @Override
        public void onFinish() {

        }
    }
}
