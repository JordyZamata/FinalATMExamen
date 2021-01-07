package com.examen.fingerprints;

import com.examen.fingerprints.config.SwaggerConfig;
import com.examen.fingerprints.model.FingerprintResponse;
import com.examen.fingerprints.request.FingerprintRequest;
import io.reactivex.Single;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootTest
public class FirstTest {



    @Test
    public void fingerprintResponse() {


        FingerprintResponse fingerprintResponse = new FingerprintResponse("Core", true);

        Assert.notNull(fingerprintResponse);


    }

    @Test
    public void getInstanceFingerResponse(){
        FingerprintResponse fg = new FingerprintResponse("test", true);
        Assert.notNull(fg);

    }
    @Test
    public void getInstanceFingerRequest(){
        FingerprintRequest fg = new FingerprintRequest("test");
        Assert.notNull(fg);
    }

    @Test
    public void getInstanceFingerRequestNoParam(){
        FingerprintRequest fg = new FingerprintRequest();
        Assert.notNull(fg);
    }

    @Test
    public void FingerprintResponseGetEntity(){
        FingerprintResponse fg = new FingerprintResponse("test", true);
        Assertions.assertEquals(fg.getEntityName(), "test");

    }

    @Test
    public void FingerprintResponseIsSuccess(){
        FingerprintResponse fg = new FingerprintResponse("test", true);
        Assertions.assertEquals(fg.isSuccess(), true);

    }

    @Test
    public void FingerPrintResponseSetEntity(){
        FingerprintResponse fg = new FingerprintResponse();
        fg.setEntityName("test");

        Assertions.assertEquals(fg.getEntityName(), "test");

    }

    @Test
    public void fingerprint(){
        FingerprintResponse fg = new FingerprintResponse();
        FingerprintResponse fg2 = new FingerprintResponse("test", true);
        fg.hashCode();
        fg.toString();
        fg.setSuccess(fg2.isSuccess());
        fg.setEntityName(fg2.getEntityName());
        Assertions.assertTrue(fg.equals(fg2));


    }





}
