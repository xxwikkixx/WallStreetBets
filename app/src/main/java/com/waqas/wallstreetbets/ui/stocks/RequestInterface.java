package com.waqas.wallstreetbets.ui.stocks;

import com.waqas.wallstreetbets.Model;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface RequestInterface {

//    ArrayList<Model> model = new ArrayList<>();
//    String str = model.get(0).
//    @GET("stocks/{date}")
//    Call<List<Model>> getAllData(@Path("date") model);

    @GET("stocks/2020-02-14")
    Call<List<Model>> getAllData();
}
