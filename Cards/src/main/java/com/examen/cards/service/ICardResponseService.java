package com.examen.cards.service;

import com.examen.cards.data.CardResponse;
import com.examen.cards.model.Card;
import io.reactivex.Single;

import java.util.List;

public interface ICardResponseService {

    public Single<CardResponse> findAllCardResponse(String doc);

}
