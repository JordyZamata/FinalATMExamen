package com.examen.atm.service;

import com.examen.atm.model.CardResponse;
import com.examen.atm.model.Person;
import com.examen.atm.request.DocumentRequest;
import com.examen.atm.response.DocumentResponse;
import io.reactivex.Single;

public interface IATMDepositService {

    public Single<DocumentResponse> documentRequest(DocumentRequest doc);

}
