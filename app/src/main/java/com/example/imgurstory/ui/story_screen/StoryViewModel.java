package com.example.imgurstory.ui.story_screen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.imgurstory.repository.remote.ImgurRepository;
import com.example.imgurstory.repository.remote.model.catagory_response.CatagoryListResponse;

public class StoryViewModel extends ViewModel {

    MutableLiveData<CatagoryListResponse> categoryListData;

    public StoryViewModel() {
        categoryListData = ImgurRepository.getInstance().getCategoryList();
    }

    public LiveData<CatagoryListResponse> getCategoryList() {
        return categoryListData;
    }
}
