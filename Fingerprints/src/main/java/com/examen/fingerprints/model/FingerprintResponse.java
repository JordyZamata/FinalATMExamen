package com.examen.fingerprints.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class FingerprintResponse {

    private String entityName;
    private boolean success;

}
