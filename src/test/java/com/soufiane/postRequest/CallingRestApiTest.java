package com.soufiane.postRequest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CallingRestApiTest {

    @Test
    public void makePostCallTest() {
        String response = CallingRestApi.call();
        System.out.println(response);
    }
}
