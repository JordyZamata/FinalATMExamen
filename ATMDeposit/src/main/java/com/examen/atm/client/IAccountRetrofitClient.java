package com.examen.atm.client;

import com.examen.atm.model.AccountResponse;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IAccountRetrofitClient {

    @GET("/core/account/cardNumber={carNumber}")
    public Single<AccountResponse> findAccountResponse(@Path("carNumber") String carNumber);

}
