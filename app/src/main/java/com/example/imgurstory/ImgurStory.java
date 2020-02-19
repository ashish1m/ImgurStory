package com.example.imgurstory;

import android.app.Application;

import com.example.imgurstory.repository.remote.ImgurApi;
import com.example.imgurstory.repository.remote.ImgurRepository;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ImgurStory extends Application {

    private static ImgurStory mInstance;
    private Retrofit mRetrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .addInterceptor(chain -> {
                    Request original = chain.request();
                    Request request = original.newBuilder()
                            .header("Authorization", "Client-ID " + ImgurApi.ClientId)
                            .method(original.method(), original.body())
                            .build();

                    return chain.proceed(request);
                })
                .build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(ImgurApi.SERVER)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        ImgurRepository.getInstance().fetchData();
    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }

    public static ImgurStory getInstance() {
        return mInstance;
    }
}
