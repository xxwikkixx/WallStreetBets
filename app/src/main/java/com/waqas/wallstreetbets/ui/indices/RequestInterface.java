package com.waqas.wallstreetbets.ui.indices;

import com.waqas.wallstreetbets.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface RequestInterface {

    @GET("indices/{date}")
    Call<List<Model>> getIndicesData(@Path("date") String date);

}
