package com.soufiane.postRequest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CallingRestApiTest {

    @Test
    public void makePostCallTest() {
        String response = CallingRestApi.call();
        System.out.println(response);
    }

    @Test
    public void reduceStreamTest() {
        List<String> list = Arrays.asList("A", "B", "C");
        String idRecipients = list.stream().reduce("", (sum, p ) -> sum + "," + p);
        System.out.println(idRecipients);
    }
}
