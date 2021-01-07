package com.examen.fingerprints.controller;

import com.examen.fingerprints.model.FingerprintResponse;
import com.examen.fingerprints.request.FingerprintRequest;
import com.examen.fingerprints.service.IFingerprintService;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FingerprintController {

    @Autowired
    IFingerprintService service;

    @PostMapping("/core/fingerprints/validate")
    public Single<FingerprintResponse> fingerprintResponse(@RequestBody FingerprintRequest fingerprintRequest){

        return service.fingerprintResponse(fingerprintRequest);
    }

}
