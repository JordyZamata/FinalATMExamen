package com.examen.person.controller;

import com.examen.person.model.Person;
import com.examen.person.service.IPersonService;

import io.reactivex.Single;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class PersonController {

    @Autowired
    private IPersonService service;

    @GetMapping("/core/persons/documentNumber={doc}")
    public Single<Person> findByDocumentPerson (@PathVariable String doc){
        return service.findByDocumentPerson(doc);
    }

    /*
    @GetMapping("/core/persons")
    public Single<Person> findByDocumentPerson (@RequestParam("documentNumber") String doc){
        return service.findByDocumentPerson(doc);
    }
    */









}
