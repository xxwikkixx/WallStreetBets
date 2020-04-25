package com.waqas.wallstreetbets.ui.etfs;

import com.waqas.wallstreetbets.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface RequestInterface {

    @GET("etfs/{date}")
    Call<List<Model>> getEtfData(@Path("date") String date);

}
