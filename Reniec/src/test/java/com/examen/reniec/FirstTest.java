package com.examen.reniec;

import com.examen.reniec.model.ReniecResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FirstTest {

    @Test
    public void reniecResponse (){

        ReniecResponse r = new ReniecResponse();
        ReniecResponse r2 = new ReniecResponse("Reniec", true);

        r.setSuccess(r2.isSuccess());
        r.setEntityName(r2.getEntityName());
        r.hashCode(); r2.hashCode();
        r.toString();

        Assertions.assertTrue(r.equals(r2));

    }

}
