package com.examen.atm.service.impl;

import com.examen.atm.client.*;
import com.examen.atm.model.*;
import com.examen.atm.request.DocumentRequest;

import com.examen.atm.request.FingerprintRequest;
import com.examen.atm.request.ReniecRequest;
import com.examen.atm.response.DocumentResponse;
import com.examen.atm.response.ReniecResponse;
import com.examen.atm.service.IATMDepositService;
import io.reactivex.Observable;
import io.reactivex.Single;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ATMDepositServiceImpl implements IATMDepositService {


    @Autowired
    private PersonRetrofitClient personRetrofitClient;

    @Autowired
    private CardRetrofitClient cardRetrofitClient;

    @Autowired
    private IAccountRetrofitClient iAccountRetrofitClient;

    @Autowired
    private IFingerprintRetrofitClient iFingerprintRetrofitClient;

    @Autowired
    private IReniecRetrofitClient iReniecRetrofitClient;

    private FingerprintRequest fingerRequest = new FingerprintRequest();
    private ReniecRequest reniecRequest = new ReniecRequest();
    private List<accountNumber> accountNumbers = new ArrayList<>();

    private double monto;
    @Override
    public Single<DocumentResponse> documentRequest(DocumentRequest doc) {

        Single<Person> byDocumentPerson = personRetrofitClient.findByDocumentPerson(doc.getDocumentNumber());

        Person person = byDocumentPerson.toObservable().blockingSingle();

        Single<CardResponse> byDocumentCard = cardRetrofitClient.findAllCardResponse(person.getDocument());

        CardResponse cardResponse  = byDocumentCard.toObservable().blockingSingle();
        List<Card> cardsHabilitados = cardResponse.getCards().stream()
                            .filter(c -> c.isActive() == true).collect(Collectors.toList());

        //List<AccountResponse> accountResponse = new ArrayList<>();

        for (Card habilitados: cardsHabilitados){
            Single<AccountResponse> byDocumentAccount = iAccountRetrofitClient.findAccountResponse(habilitados.getCardNumber());
            AccountResponse getAccount = byDocumentAccount.toObservable().blockingSingle();
            //accountResponse.add(byDocumentAccount.toObservable().blockingSingle());

            new accountNumber(getAccount.getAccountNumber());
            monto += getAccount.getAmount();

            accountNumbers.add(new accountNumber(getAccount.getAccountNumber()));
        }

        String entityName;

        if( person.isFingerprint()) {
            fingerRequest.setDocumentNumber(person.getDocument());
            Single<FingerprintResponse> byDocumentFingerprint = iFingerprintRetrofitClient.fingerprintResponse(fingerRequest);

            FingerprintResponse fingerprintResponse = byDocumentFingerprint.toObservable().blockingSingle();

            entityName = fingerprintResponse.getEntityName();



        }else {

            reniecRequest.setDocumentNumber(person.getDocument());
            Single<ReniecResponse> byDocumentReniec = iReniecRetrofitClient.reniecResponse(reniecRequest);

            ReniecResponse reniecResponse = byDocumentReniec.toObservable().blockingSingle();

            entityName = reniecResponse.getEntityName();
        }

        DocumentResponse documentResponse = new DocumentResponse(entityName,accountNumbers, monto);
        System.out.println(documentResponse);


        //


        //accountResponse.forEach(System.out::println);



        return Single.just(documentResponse);

    }



}
