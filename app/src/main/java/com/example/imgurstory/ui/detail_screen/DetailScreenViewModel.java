package com.example.imgurstory.ui.detail_screen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.imgurstory.repository.remote.ImgurRepository;
import com.example.imgurstory.repository.remote.model.comments.CommentListResponse;

public class DetailScreenViewModel extends ViewModel {

    MutableLiveData<CommentListResponse> commentListData;

    public LiveData<CommentListResponse> getCommentList(String imageId) {
        if (commentListData == null){
            commentListData = ImgurRepository.getInstance().getCommentsList(imageId);
        }
        return commentListData;
    }
}
