package com.examen.person;

import com.examen.person.model.Person;
import io.reactivex.Observable;
import io.reactivex.Single;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestPersonServiceImpl {



    @Test
    public void TestfindByDocumentPerson(){
        String doc = "10000000";
        Observable<Person> singlePerson = Observable.just(
                new Person("1", "10000000", true, false),
                new Person("2", "10000001", false, false),
                new Person("3", "10000002", true, true)
        ).filter(p -> doc.equals(p.getDocument()));




        Assertions.assertEquals(singlePerson.blockingSingle(),
                new Person("1", "10000000", true, false));
    }

    @Test
    public void person(){
        Person p = new Person();
        Person p2 = new Person("1", "10000000", true, false);
        p.setBlacklist(p2.isBlacklist());
        p.setFingerprint(p2.isFingerprint());
        p.setDocument(p2.getDocument());
        p.setId(p2.getId());
        p.hashCode();
        p2.toString();
        Assertions.assertTrue(p.equals(p2));

    }




}
