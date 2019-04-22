package com.soufiane.json_to_objetct;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.soufiane.json_to_objetct.model.Contrats;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonToObjectTest {
    @Test
    public void jsonToObjectTest() throws IOException {
        //ObjectMapper objectMapper = new ObjectMapper();
        String tempFile2 = "[{\n" +
                "  \"contrat\": {\n" +
                "    \"cvo\": \"CEOV400089999\",\n" +
                "    \"ideta\": \"02001789\",\n" +
                "    \"ident\": \"15497912\",\n" +
                "    \"creation_DATE\": null,\n" +
                "    \"commissioning_DATE\": \"20190620\",\n" +
                "    \"account_FE\": null,\n" +
                "    \"email\": \"marylene.sannicandro@orange.com\",\n" +
                "    \"agency\": \"EAF\",\n" +
                "    \"usage_TYPE\": \"professionnel\",\n" +
                "    \"tag\": \"Migré ASM Prod\",\n" +
                "    \"contract_TYPE\": \"entité\",\n" +
                "    \"main_CVO\": \"CVOSI00000940\",\n" +
                "    \"is_PAYER\": \"oui\",\n" +
                "    \"billing_TYPE\": \"OSA\",\n" +
                "    \"entity_EMAIL\": \"toto@gmail.com\"\n" +
                "  },\n" +
                "  \"formule\": {\n" +
                "    \"cvo\": \"CEOV400089999\",\n" +
                "    \"formula\": \"SMS_5000\",\n" +
                "    \"has_REPORT_OPTION\": \"oui\",\n" +
                "    \"report_PRICE\": \"10\",\n" +
                "    \"commitment_PERIOD\": \"24\"\n" +
                "  },\n" +
                "  \"mediaList\": [\n" +
                "    {\n" +
                "      \"cvo\": \"CEOV400089999\",\n" +
                "      \"media_TYPE\": \"SMS\"\n" +
                "    }\n" +
                "  ]\n" +
                "}]";
        final File tempFile = new File("/home/soufiane/Documents/massInject/New/inject.json");

        ObjectMapper objectMapper = new ObjectMapper();
        List<Contrats> contr = objectMapper.readValue(tempFile, new TypeReference<List<Contrats>>(){});
        System.out.println(contr.size());
    }
}
