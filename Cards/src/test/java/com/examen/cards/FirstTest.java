package com.examen.cards;

import com.examen.cards.data.CardResponse;
import com.examen.cards.model.Card;
import io.reactivex.Single;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class FirstTest {

    @Test
    public void card(){

        Card c = new Card();
        Card c2 = new Card("12", true);

        c.equals(c2);
        c.setCardNumber("12");
        c.setActive(true);
        c2.equals(c);

        Assertions.assertNotNull(c);
    }

    @Test
    public void cardResponse(){
        CardResponse cardResponse = new CardResponse();
        CardResponse cardResponse2 = new CardResponse();

        List<Card> c = new ArrayList<>();
        c.add(new Card("test",true));
        List<Card> c2 = new ArrayList<>();
        c.add(new Card("test",true));

        CardResponse cardResponse3 = new CardResponse(c);
        cardResponse.equals(cardResponse2);
        cardResponse.setCards(c);
        cardResponse2.setCards(c);
        cardResponse.getCards().equals(cardResponse2.getCards());
        cardResponse.toString();
        cardResponse.hashCode();

        Assertions.assertNotNull(cardResponse);
    }

}
