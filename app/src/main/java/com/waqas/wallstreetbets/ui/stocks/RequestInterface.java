package com.waqas.wallstreetbets.ui.stocks;

import com.waqas.wallstreetbets.Model;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface RequestInterface {

    @GET("stocks/{date}")
    Call<List<Model>> getStockData(@Path("date") String date);

}
