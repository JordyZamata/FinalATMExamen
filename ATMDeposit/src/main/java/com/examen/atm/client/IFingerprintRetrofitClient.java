package com.examen.atm.client;

import com.examen.atm.model.FingerprintResponse;
import com.examen.atm.request.FingerprintRequest;
import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IFingerprintRetrofitClient {


    @POST("/core/fingerprints/validate")
    public Single<FingerprintResponse> fingerprintResponse(@Body FingerprintRequest fingerprintsRequest);

}
