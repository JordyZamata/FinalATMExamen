package com.examen.atm.client;

import com.examen.atm.request.ReniecRequest;
import com.examen.atm.response.ReniecResponse;
import io.reactivex.Single;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IReniecRetrofitClient {

    @POST("/external/reniec/validate")
    public Single<ReniecResponse> reniecResponse(@Body ReniecRequest reniecRequest);

}
