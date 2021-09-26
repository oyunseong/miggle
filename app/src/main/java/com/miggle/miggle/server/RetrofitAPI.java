package com.miggle.miggle.server;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitAPI {

    @POST("https://www.developer-hyun.com/app/users")
    Call<Model__CheckAlready> postOverlapCheck(@Body Model__CheckAlready modelCheckAlready); //이건 바디 요청시 사용하는거

    //@FormUrlEncoded
    //@POST("/auth/overlapChecker")
    //Call<Model__CheckAlready> postOverlapCheck(@Field("phone") String phoneNum, @Field("message") String message); //이건 요청시 사용하는거 (*데이터를 보낼때)
}