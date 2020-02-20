package com.example.imgurstory.ui.detail_screen;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.example.imgurstory.repository.remote.ImgurRepository;
import com.example.imgurstory.repository.remote.model.catagory_response.CatagoryListResponse;
import com.example.imgurstory.repository.remote.model.catagory_response.ImageData;
import com.example.imgurstory.repository.remote.model.comments.CommentListResponse;

public class DetailScreenViewModel extends ViewModel {
    MediatorLiveData<CommentListResponse> commentListData;
    MediatorLiveData<CatagoryListResponse> categoryListData;

    public LiveData<CommentListResponse> getCommentList(String imageId) {
        if (commentListData == null) {
            commentListData = ImgurRepository.getInstance().getCommentsList(imageId);
        }
        return commentListData;
    }

    public LiveData<ImageData> getImageData(int index) {
        categoryListData = ImgurRepository.getInstance().getCategoryList();
        return Transformations.switchMap(categoryListData, new Function<CatagoryListResponse, LiveData<ImageData>>() {
            @Override
            public LiveData<ImageData> apply(CatagoryListResponse input) {
                MediatorLiveData<ImageData> imageData = new MediatorLiveData<>();
                imageData.postValue(input.getData().get(index));
                return imageData;
            }
        });
    }
}
