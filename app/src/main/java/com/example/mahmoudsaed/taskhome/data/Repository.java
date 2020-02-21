package com.example.mahmoudsaed.taskhome.data;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.example.mahmoudsaed.taskhome.data.model.Attraction;
import com.example.mahmoudsaed.taskhome.data.model.Event;
import com.example.mahmoudsaed.taskhome.data.model.Hotspot;
import com.example.mahmoudsaed.taskhome.data.remote.ApiRequestInterface;
import com.example.mahmoudsaed.taskhome.data.remote.Data;
import com.example.mahmoudsaed.taskhome.data.remote.Response;

import java.util.List;
import java.util.concurrent.Executor;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

/**
 * Created by Mahmoud Saed on 2/19/2020.
 */

public class Repository {


    private Retrofit homeApi;
    public Repository( Retrofit HomerApi){
        this.homeApi=HomerApi;
    }

    public LiveData<Data> getRemoteData(){
        final MutableLiveData<Data> data = new MutableLiveData<>();
        homeApi.create(ApiRequestInterface.class).getHomeData().enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call,  retrofit2.Response<Response> response) {
                data.setValue(response.body().getData());
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                data.setValue(null);
            }
        });
        return data;
    }



}
