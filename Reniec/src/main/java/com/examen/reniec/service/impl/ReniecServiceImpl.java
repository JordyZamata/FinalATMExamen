package com.examen.reniec.service.impl;

import com.examen.reniec.model.ReniecResponse;
import com.examen.reniec.request.ReniecRequest;
import com.examen.reniec.service.IReniecService;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReniecServiceImpl implements IReniecService {


    @Override
    public Single<ReniecResponse> reniecResponse(ReniecRequest reniecRequest) {
        ReniecResponse reniecResponse = new ReniecResponse("Reniec", true);
        return Single.just(reniecResponse);
    }
}
