package com.example.mahmoudsaed.taskhome.di.modules;

import com.example.mahmoudsaed.taskhome.data.Repository;



import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Mahmoud Saed on 2/19/2020.
 */
@Module(includes = {NetworkServiceModule.class, ApplicationModule.class})
public class DataServiceModule {

    @Provides
    @Singleton
    Repository provideRepository(Retrofit HomerApi){
        return new Repository(HomerApi);
    }


}
