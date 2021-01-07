package com.examen.reniec.model;

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
