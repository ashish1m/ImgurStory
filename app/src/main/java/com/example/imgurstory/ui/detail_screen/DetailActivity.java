package com.example.imgurstory.ui.detail_screen;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imgurstory.R;
import com.example.imgurstory.repository.remote.model.comments.CommentListResponse;

public class DetailActivity extends AppCompatActivity {

    private DetailScreenViewModel mDetailScreenViewModel;
    private TextView mTitleTv, mTagsTv;
    private RecyclerView mCommentsRv;
    private CommentListAdapter mCommentListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mDetailScreenViewModel = new ViewModelProvider(this).get(DetailScreenViewModel.class);
        initView();
    }

    private void initView() {
        mTitleTv = findViewById(R.id.tv_title);
        mTagsTv = findViewById(R.id.tv_tags);
        mCommentsRv = findViewById(R.id.rv_comments);
        mCommentsRv.setHasFixedSize(true);
        mCommentsRv.setLayoutManager(new LinearLayoutManager(this));

        mDetailScreenViewModel.getCommentList("EiVNYUC").observe(this, new Observer<CommentListResponse>() {
            @Override
            public void onChanged(CommentListResponse commentListResponse) {
                mCommentListAdapter = new CommentListAdapter(DetailActivity.this, commentListResponse.getData());
                mCommentsRv.setAdapter(mCommentListAdapter);
            }
        });

    }
}
