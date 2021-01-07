package com.examen.atm.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ReniecResponse {


    private String entityName;
    private boolean success;
}
