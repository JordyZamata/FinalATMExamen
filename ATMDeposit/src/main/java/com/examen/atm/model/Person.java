package com.examen.atm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Person {

    private String id;
    private String document;
    private boolean fingerprint;
    private boolean blacklist;

}
