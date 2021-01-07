package com.examen.person.service;


import com.examen.person.model.Person;
import io.reactivex.Single;




public interface IPersonService {

    public Single<Person> findByDocumentPerson( String doc);



}
