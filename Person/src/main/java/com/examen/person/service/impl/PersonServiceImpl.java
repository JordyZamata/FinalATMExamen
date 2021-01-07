package com.examen.person.service.impl;

import com.examen.person.model.Person;
import com.examen.person.service.IPersonService;
import io.reactivex.Observable;
import io.reactivex.Single;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class PersonServiceImpl implements IPersonService {



    @Override
    public Single<Person> findByDocumentPerson(String doc) {

        Observable<Person> singlePerson = Observable.just(
                new Person("1", "10000000", true, false),
                new Person("2", "10000001", false, false),
                new Person("3", "10000002", true, true)
        ).filter(p -> doc.equals(p.getDocument()));


        return  Single.fromObservable(singlePerson);
    }


}
