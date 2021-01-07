package com.examen.fingerprints.service;

import com.examen.fingerprints.model.FingerprintResponse;
import com.examen.fingerprints.request.FingerprintRequest;
import io.reactivex.Single;

public interface IFingerprintService {

    public Single<FingerprintResponse> fingerprintResponse(FingerprintRequest fingerprintRequest);

}
