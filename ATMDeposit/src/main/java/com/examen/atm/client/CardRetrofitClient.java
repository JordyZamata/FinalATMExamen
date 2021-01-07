package com.examen.atm.client;

import com.examen.atm.model.CardResponse;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CardRetrofitClient {


    @GET("/core/cards/documentNumber={document}")
    public Single<CardResponse> findAllCardResponse(@Path("document") String document);


}
