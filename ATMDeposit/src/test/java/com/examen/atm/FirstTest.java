package com.examen.atm;

import com.examen.atm.model.*;
import com.examen.atm.request.DocumentRequest;
import com.examen.atm.request.FingerprintRequest;
import com.examen.atm.request.ReniecRequest;
import com.examen.atm.response.DocumentResponse;
import com.examen.atm.response.ReniecResponse;
import com.examen.atm.service.impl.ATMDepositServiceImpl;
import io.reactivex.Single;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class FirstTest {
    //AccountNumber
    @Test
    public void getInstanceAccountNumber(){
        accountNumber account = new accountNumber("test");
        Assertions.assertNotNull(account);

    }

    @Test
    public void getAccountNumber(){
        accountNumber account = new accountNumber("test");
        account.setAccountNumber("123123");
        Assertions.assertNotNull(account.getAccountNumber());

    }

    //Account Response
    @Test
    public void getInstanceAccountResponse(){
        AccountResponse account = new AccountResponse("test",1);
        Assertions.assertNotNull(account);

    }

    @Test
    public void getNumberAccountResponse(){
        AccountResponse account = new AccountResponse("test",1);
        account.setAccountNumber("test2");
        Assertions.assertEquals(account.getAccountNumber(), "test2");
    }

    @Test
    public void getAmountAccountResponse(){
        AccountResponse account = new AccountResponse("test",1);
        account.setAmount(2);
        Assertions.assertEquals(account.getAmount(), 2);

    }

    @Test
    public void getAccountResponse(){
        AccountResponse account = new AccountResponse();
        Assertions.assertNotNull(account);
    }
    @Test
    public void equalAccountResponse(){
        AccountResponse account = new AccountResponse("test",1);
        AccountResponse account2 = new AccountResponse("test",1);
        account.setAccountNumber("1");
        account.toString();
        account.equals(account2);
        account.hashCode();
        Assertions.assertTrue(account.getAccountNumber().equals("1"));

    }
    @Test
    public void equalAccountResponse2(){
        AccountResponse account = new AccountResponse("test",1);
        AccountResponse account2 = new AccountResponse("test",1);

        account2.hashCode();
        Assertions.assertTrue(account2.equals(account));

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
    public void fingerPrintResponse(){


        FingerprintResponse f1 = new FingerprintResponse();
        FingerprintResponse f2 = new FingerprintResponse("core", true);
        f1.hashCode();
        f2.hashCode();
        f1.equals(f2);
        f2.equals(f1);
        f1.setEntityName(f2.getEntityName());
        f1.setSuccess(f2.isSuccess());

        Assertions.assertNotNull(f1);
    }

    @Test
    public void Person(){
        Person p = new Person();
        Person p2 = new Person("test", "test", true, true);
        p.setBlacklist(p2.isBlacklist());
        p.setDocument(p2.getDocument());
        p.setId(p2.getId());
        p.setFingerprint(p2.isFingerprint());
        p.equals(p2);
        p2.equals(p);
        p.hashCode();
        p2.hashCode();
        p.toString();
        Assertions.assertEquals(p, p2);
    }


    @Test
    public void fingerRequest(){

        FingerprintRequest f = new FingerprintRequest();

        f.setDocumentNumber("1000000000");

        Assertions.assertNotNull(f.getDocumentNumber());


    }

    @Test
    public void reniecRequest(){

        ReniecRequest r = new ReniecRequest();
        r.setDocumentNumber("10000000");
        Assertions.assertNotNull(r.getDocumentNumber());
    }

    @Test
    public void documentRequest(){

        DocumentRequest d = new DocumentRequest();
        d.setDocumentNumber("10000000");
        Assertions.assertNotNull(d.getDocumentNumber());
    }

    @Test
    public void ReniecResponse(){
        ReniecResponse r = new ReniecResponse();
        ReniecResponse r2 = new ReniecResponse("Reniec", true);
        r.setSuccess(r2.isSuccess());
        r.setEntityName(r2.getEntityName());
        r.toString();
        r.equals(r2);
        r2.equals(r);
        r.hashCode();
        Assertions.assertNotNull(r);

    }

    @Test
    public void DocumentResponse(){
        DocumentResponse d = new DocumentResponse();

        List<accountNumber> a = new ArrayList<>();

        a.add(new accountNumber("10000000"));

        DocumentResponse d2 = new DocumentResponse("test", a, 1.0);

        d.setFingerprintEntityName(d2.getFingerprintEntityName());
        d.setValidAccounts(d2.getValidAccounts());
        d.setCustomerAmount(d2.getCustomerAmount());

        d.equals(d2);
        d2.equals(d);

        d.toString();
        d2.hashCode();

        Assertions.assertNotNull(d);
    }






}
