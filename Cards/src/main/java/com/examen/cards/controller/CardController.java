package com.examen.cards.controller;

import com.examen.cards.data.CardResponse;
import com.examen.cards.model.Card;
import com.examen.cards.service.ICardResponseService;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CardController {

    @Autowired
    ICardResponseService service;

    @GetMapping("/core/cards/documentNumber={document}")
    public Single<CardResponse> findAllCardResponse(@PathVariable String document) {


        return service.findAllCardResponse(document);
    }


}
