package com.example.imgurstory.ui.detail_screen;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imgurstory.R;
import com.example.imgurstory.repository.remote.model.comments.CommentListData;

import java.util.ArrayList;

public class CommentListAdapter extends RecyclerView.Adapter<CommentListAdapter.ViewHolder> {

    private final LayoutInflater mInflater;
    private ArrayList<CommentListData> mCommentList;

    public CommentListAdapter(Context context, ArrayList<CommentListData> commentList) {
        mCommentList = commentList;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(mInflater.inflate(R.layout.comment_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CommentListData commentData = mCommentList.get(position);
        String comment = "<b>" + commentData.getAuthor() + "</b>: " + commentData.getComment();
        holder.mCommentTv.setText(Html.fromHtml(comment));
    }

    @Override
    public int getItemCount() {
        if (mCommentList != null) {
            return mCommentList.size();
        }
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mCommentTv;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            mCommentTv = itemView.findViewById(R.id.tv_comment);
        }
    }
}
