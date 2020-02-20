package com.example.imgurstory.ui.detail_screen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imgurstory.R;
import com.example.imgurstory.repository.remote.model.catagory_response.ImageData;
import com.example.imgurstory.repository.remote.model.catagory_response.Tags;
import com.example.imgurstory.repository.remote.model.comments.CommentListResponse;
import com.example.imgurstory.ui.util.DownloadImageTask;

public class DetailActivity extends AppCompatActivity {

    public static final String CURRENT_INDEX = "current_index";
    private DetailScreenViewModel mDetailScreenViewModel;
    private TextView mTitleTv, mTagsTv;
    private RecyclerView mCommentsRv;
    private CommentListAdapter mCommentListAdapter;
    private ImageData mImageData;
    private int mCurrentIndex;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        if (intent != null) {
            mCurrentIndex = intent.getIntExtra(CURRENT_INDEX, -1);
        }
        mDetailScreenViewModel = new ViewModelProvider(this).get(DetailScreenViewModel.class);
        initView();
    }

    private void initView() {
        mTitleTv = findViewById(R.id.tv_title);
        mTagsTv = findViewById(R.id.tv_tags);
        mImageView = findViewById(R.id.iv_image);
        mCommentsRv = findViewById(R.id.rv_comments);
        mCommentsRv.setHasFixedSize(true);
        mCommentsRv.setLayoutManager(new LinearLayoutManager(this));

        mDetailScreenViewModel.getImageData(mCurrentIndex).observe(this, new Observer<ImageData>() {
            @Override
            public void onChanged(ImageData imageData) {
                mImageData = imageData;
                updateUI();
            }
        });
    }

    private void updateUI() {
        if (mImageData == null) {
            return;
        }

        mTitleTv.setText(mImageData.getTitle());
        new DownloadImageTask(new DownloadImageTask.Observer() {
            @Override
            public void onComplete(Bitmap bitmap) {
                mImageView.setImageBitmap(bitmap);
            }
        }).execute(mImageData.getImages().get(0).getLink());
        loadTags();
        loadComments(mImageData.getId());
    }

    @SuppressLint("SetTextI18n")
    private void loadTags() {
        StringBuilder tagString = new StringBuilder();
        for (int i = 0; i < mImageData.getTags().size(); i++) {
            Tags tag = mImageData.getTags().get(i);
            if (i == mImageData.getTags().size() - 1) {
                tagString.append(tag.getName()).append(".");
            } else {
                tagString.append(tag.getName()).append(", ");
            }
        }
        mTagsTv.setText("Tags: " + tagString);
    }

    private void loadComments(String imageId) {
        mDetailScreenViewModel.getCommentList(imageId).observe(this, new Observer<CommentListResponse>() {
            @Override
            public void onChanged(CommentListResponse commentListResponse) {
                mCommentListAdapter = new CommentListAdapter(DetailActivity.this, commentListResponse.getData());
                mCommentsRv.setAdapter(mCommentListAdapter);
            }
        });
    }
}
