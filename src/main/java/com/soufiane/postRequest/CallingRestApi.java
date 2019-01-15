package com.soufiane.postRequest;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.File;

public class CallingRestApi {
    public static String call() {
        String url = "http://localhost:8989/webservices/contracts/inject/import";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        //builder.queryParam("", "");

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        headers.add("sm_universalid", "kpml6057");

        LinkedMultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        // Putting a json file
        params.add("contractsImport", new FileSystemResource(new File("/home/soufiane/Documents/massInject/jsonThomas.json")));

        HttpEntity<MultiValueMap<String, Object>> request = new HttpEntity<>(params, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                builder.build().encode().toUri(),
                HttpMethod.POST,
                request,
                String.class);

        return responseEntity.getBody();
    }
}
