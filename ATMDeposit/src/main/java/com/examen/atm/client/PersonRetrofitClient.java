package com.examen.atm.client;

import com.examen.atm.model.Person;

import io.reactivex.Single;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface PersonRetrofitClient {



    @GET("/core/persons/documentNumber={doc}")
    public Single<Person> findByDocumentPerson(@Path("doc") String doc);




}
