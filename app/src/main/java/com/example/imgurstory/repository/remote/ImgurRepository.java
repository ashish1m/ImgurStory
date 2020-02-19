package com.example.imgurstory.repository.remote;

import androidx.lifecycle.MutableLiveData;

import com.example.imgurstory.ImgurStory;
import com.example.imgurstory.repository.remote.model.catagory_response.CatagoryListResponse;
import com.example.imgurstory.repository.remote.model.comments.CommentListResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ImgurRepository {
    private static ImgurRepository sInstance;
    private final ImgurApi mImgurStoryService;
    private MutableLiveData<CatagoryListResponse> categoryListData;

    private ImgurRepository() {
        mImgurStoryService = ImgurStory.getInstance().getRetrofit().create(ImgurApi.class);
    }

    public static ImgurRepository getInstance() {
        if (sInstance == null) {
            synchronized (ImgurRepository.class) {
                if (sInstance == null)
                    sInstance = new ImgurRepository();
            }
        }
        return sInstance;
    }

    public void fetchData() {
        categoryListData = new MutableLiveData<>();
        mImgurStoryService.getScienceTechCategoryList().enqueue(new Callback<CatagoryListResponse>() {
            @Override
            public void onResponse(Call<CatagoryListResponse> call, Response<CatagoryListResponse> response) {
                if (response.isSuccessful()) {
                    categoryListData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<CatagoryListResponse> call, Throwable t) {
                categoryListData.setValue(null);
            }
        });
    }

    public MutableLiveData<CatagoryListResponse> getCategoryList() {
        return categoryListData;
    }

    public MutableLiveData<CommentListResponse> getCommentsList(String imageId) {
        MutableLiveData<CommentListResponse> commentListData = new MutableLiveData<>();
        mImgurStoryService.getCommentsForImage(imageId).enqueue(new Callback<CommentListResponse>() {
            @Override
            public void onResponse(Call<CommentListResponse> call, Response<CommentListResponse> response) {
                if (response.isSuccessful()) {
                    commentListData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<CommentListResponse> call, Throwable t) {
                commentListData.setValue(null);
            }
        });

        return commentListData;
    }
}
