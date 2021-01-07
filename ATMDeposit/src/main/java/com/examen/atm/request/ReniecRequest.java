package com.examen.atm.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReniecRequest {

    @JsonProperty("documentNumber")
    private String documentNumber;

}
