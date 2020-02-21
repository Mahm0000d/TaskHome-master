package com.example.mahmoudsaed.taskhome.ui.activity;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.mahmoudsaed.taskhome.data.Repository;
import com.example.mahmoudsaed.taskhome.data.model.Attraction;
import com.example.mahmoudsaed.taskhome.data.model.Event;
import com.example.mahmoudsaed.taskhome.data.model.Hotspot;
import com.example.mahmoudsaed.taskhome.data.remote.Data;

import java.util.List;
import java.util.concurrent.Executor;

import javax.inject.Inject;

/**
 * Created by Mahmoud Saed on 2/20/2020.
 */

public class HomeViewModel extends ViewModel {
     Repository repository;
    @Inject
    public HomeViewModel(Repository repository){
        this.repository=repository;
    }
    public LiveData<Data> getRemote(){
       return repository.getRemoteData();
    }


}
