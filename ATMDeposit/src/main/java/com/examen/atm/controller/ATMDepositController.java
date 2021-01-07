package com.examen.atm.controller;

import com.examen.atm.client.PersonRetrofitClient;
import com.examen.atm.model.Person;
import com.examen.atm.request.DocumentRequest;
import com.examen.atm.response.DocumentResponse;
import com.examen.atm.service.IATMDepositService;
import io.reactivex.Single;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import retrofit2.http.GET;

@RestController
@RequiredArgsConstructor
public class ATMDepositController {

    @Autowired
    IATMDepositService serviceAtm;


    @PostMapping("/atm/deposits")
    public Single<DocumentResponse> documentRequest(@RequestBody DocumentRequest doc){
        return serviceAtm.documentRequest(doc);
    }












}
