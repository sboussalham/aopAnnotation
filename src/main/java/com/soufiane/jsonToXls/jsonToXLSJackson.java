package com.soufiane.jsonToXls;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class jsonToXLSJackson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        //Contrats contrats = objectMapper.readValue(new File("/home/soufiane/Documents/massInject/test.json"), Contrats.class);

        JsonNode jsonNode = objectMapper.readTree(new File("/home/soufiane/Documents/massInject/test.json"));

        Contrats contrats = objectMapper.readValue(jsonNode.get("Contrats").asText(), Contrats.class);

        /*Contrats contrats = new Contrats(new Contrat("CVO061119", "PRINCIPAL"), new Formule("CVO001", ""));
        objectMapper.writeValue(new File("/home/soufiane/Documents/massInject/testWrited.json"), contrats);*/

        System.out.println();
    }
}
