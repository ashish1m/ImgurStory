package com.example.imgurstory.repository.remote;

import com.example.imgurstory.repository.remote.model.ImgurResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ImgurApi {

    String ClientId = "980fcce91a99153";
    String ClientSecretKey = "3b4779f9c05c09727a1686006c53ced9eed8e79d";


    String SERVER = "https://api.imgur.com/3/";
    String GALLERY_SCIENCE_TECH = "gallery/t/science_and_tech/";

    @GET(GALLERY_SCIENCE_TECH)
    Call<ImgurResponse> getScienceTechGallery();

}