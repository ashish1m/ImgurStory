package com.example.imgurstory.ui.detail_screen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imgurstory.R;

import java.util.List;

public class CommentListAdapter extends RecyclerView.Adapter<CommentListAdapter.ViewHolder> {

    private final LayoutInflater mInflater;
    private List<String> mCommentList;

    public CommentListAdapter(Context context, List<String> commentList){
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
        holder.mCommentTv.setText(position);
    }

    @Override
    public int getItemCount() {
        if (mCommentList != null){
            return mCommentList.size();
        }
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mCommentTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mCommentTv = itemView.findViewById(R.id.tv_comment);
        }
    }
}
