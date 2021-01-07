package com.examen.reniec.controller;

import com.examen.reniec.model.ReniecResponse;
import com.examen.reniec.request.ReniecRequest;
import com.examen.reniec.service.IReniecService;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReniecController {

    @Autowired
    IReniecService service;

    @PostMapping("/external/reniec/validate")
    public Single<ReniecResponse> reniecResponse(@RequestBody ReniecRequest reniecRequest){

        return service.reniecResponse(reniecRequest);
    }

}
