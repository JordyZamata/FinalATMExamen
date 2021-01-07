package com.examen.cards.service.impl;

import com.examen.cards.data.CardResponse;
import com.examen.cards.model.Card;
import com.examen.cards.service.ICardResponseService;
import io.reactivex.Single;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CardResponseImpl implements ICardResponseService {


    @Override
    public Single<CardResponse> findAllCardResponse(String document) {



        return Single.just(new CardResponse(saveCard()));
    }



    public List<Card> saveCard() {

        List<Card> lista = new ArrayList<>();
        lista.add(new Card("1111222233334441", true));
        lista.add(new Card("1111222233334442", true));
        lista.add(new Card("1111222233334443", true));
        lista.add(new Card("1111222233334444", false));
        lista.add(new Card("1111222233334445", false));
        lista.add(new Card("1111222233334446", false));

        return lista;
    }


}
