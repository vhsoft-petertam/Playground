package com.petertam.playground.net;

import com.petertam.playground.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIService {

    @GET("users/{username}")
    Call<User> getUser(@Path("username") String username);

}
