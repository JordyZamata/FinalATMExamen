package com.examen.atm.response;

import com.examen.atm.model.accountNumber;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

//import javax.validation.constraints.NotNull;
import java.util.List;


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentResponse {

    //@NotNull(message = "atm.deposit.documentNumber.fingerprintEntityName")
    @JsonProperty("fingerprintEntityName")
    private String fingerprintEntityName;

    private List<accountNumber> validAccounts;

    private double customerAmount;
}
