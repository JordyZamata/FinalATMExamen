package com.examen.reniec.service;

import com.examen.reniec.model.ReniecResponse;
import com.examen.reniec.request.ReniecRequest;
import io.reactivex.Single;

public interface IReniecService {

    public Single<ReniecResponse> reniecResponse(ReniecRequest reniecRequest);
}
