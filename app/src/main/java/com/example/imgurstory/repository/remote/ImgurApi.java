package com.example.imgurstory.repository.remote;

import com.example.imgurstory.repository.remote.model.catagory_response.CatagoryListResponse;
import com.example.imgurstory.repository.remote.model.comments.CommentListData;
import com.example.imgurstory.repository.remote.model.comments.CommentListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ImgurApi {

    String ClientId = "980fcce91a99153";
    String ClientSecretKey = "3b4779f9c05c09727a1686006c53ced9eed8e79d";


    String SERVER = "https://api.imgur.com/3/";
    String SCIENCE_TECH = "gallery/search?q_all=science AND tech&q_type=jpeg";
    String GALLERY_ITEM_TAGS = "gallery/{galleryHash}/tags";
    String GALLERY_ITEM_COMMENTS = "gallery/{galleryHash}/comments}";

    @GET(SCIENCE_TECH)
    Call<CatagoryListResponse> getScienceTechCategoryList();

    @GET(GALLERY_ITEM_COMMENTS)
    Call<CommentListResponse> getCommentsForImage(@Path(value = "galleryHash") String imageId);

}