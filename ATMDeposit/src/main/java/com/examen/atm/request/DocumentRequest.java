package com.examen.atm.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//import javax.validation.constraints.NotNull;

@Getter
@Setter
public class DocumentRequest {

    //@NotNull(message = "atm.deposit.documentNumber.notNull")
    @JsonProperty("documentNumber")
    private String documentNumber;
}
