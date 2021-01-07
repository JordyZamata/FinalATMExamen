package com.examen.fingerprints.service.impl;

import com.examen.fingerprints.model.FingerprintResponse;
import com.examen.fingerprints.request.FingerprintRequest;
import com.examen.fingerprints.service.IFingerprintService;
import io.reactivex.Single;
import org.springframework.stereotype.Service;

@Service
public class FingerprintServiceImpl implements IFingerprintService {
    @Override
    public Single<FingerprintResponse> fingerprintResponse(FingerprintRequest fingerprintRequest) {
        FingerprintResponse fingerprintResponse = new FingerprintResponse("Core", true);
        return Single.just(fingerprintResponse);
    }
}
