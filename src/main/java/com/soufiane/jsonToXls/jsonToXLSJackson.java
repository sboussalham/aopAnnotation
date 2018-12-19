package com.soufiane.jsonToXls;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.util.IOUtils;

import java.io.*;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class jsonToXLSJackson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        //Contrats contrats = objectMapper.readValue(new File("/home/soufiane/Documents/massInject/testWrited.json"), Contrats.class);

        InputStream is = new FileInputStream(new File("/home/soufiane/Documents/massInject/templateJson.json"));

        final File tempFile = File.createTempFile("template", ".json");
        tempFile.deleteOnExit();
        try (FileOutputStream out = new FileOutputStream(tempFile)) {
            IOUtils.copy(is, out);
        }

        List<Contrats> contr = objectMapper.readValue(tempFile, new TypeReference<List<Contrats>>(){});
        //JsonNode jsonNode = objectMapper.readTree(new File("/home/soufiane/Documents/massInject/testWritedMultiple.json"));
        //List<Contrats> contrats = objectMapper.readValue(new File("/home/soufiane/Documents/massInject/templateJson.json"), new TypeReference<List<Contrats>>(){});

        String mimeType = URLConnection.guessContentTypeFromStream(is);
        //constructXls(contrats);
        /*Contrats contrats = new Contrats(new Contrat("CVO061119", "PRINCIPAL"), new Formule("CVO001", ""));
        List<Contrats> contratsList = new ArrayList<>();
        contratsList.add(contrats);
        contratsList.add(contrats);*/
        //objectMapper.writeValue(new File("/home/soufiane/Documents/massInject/templateJson.json"), constructContracts());

        System.out.println();
    }

    public static void constructXls(List<Contrats> contrats) throws FileNotFoundException, IOException {
        Workbook workbook = new HSSFWorkbook();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Contrats");

        int currentRow = 0;
        for (Contrats c : contrats) {
            constructRow(sheet, currentRow++, c.getContrat().toStringValues());
            constructRow(sheet, currentRow++, c.getFormule().toStringValues());

            for (Media m : c.getMediaList()) {
                constructRow(sheet, currentRow++, m.toStringValues());
            }

            for (Option o : c.getOptionList()) {
                constructRow(sheet, currentRow++, o.toStringValues());
            }
            sheet.createRow(currentRow++);
            sheet.createRow(currentRow++);
        }

        // Resize all columns to fit the content size
        for(int j = 0; j < currentRow; j++) {
            sheet.autoSizeColumn(j);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("/home/soufiane/Documents/massInject/firstXlsTry.xls");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();

    }

    public static void constructRow(Sheet sheet, int rowNumber, List<String> rowValues) {
        Row row = sheet.createRow(rowNumber);
        int currentCell = 0;
        for (String s : rowValues) {
            row.createCell(currentCell++).setCellValue(s);
        }
    }
    public static List<Contrats> constructContracts() {

        Contrat c = new Contrat("02001789", "15497912", "", "20171004",
                "123456789", "test@test.com", "EAX", "professionnel", "ASMPROD",
                "principal", "oui", "", "", "OSA");
        Formule f = new Formule("OSM_TARIFAIRE", "24", "non",
                "", "", "4000");
        List<Media> m = Arrays.asList(new Media("SMS", "40", "100",
                "0.07", "500", "0.06", "1000",
                "0.04", "2000", "0.01"));
        List<Option> o = Arrays.asList(new Option("API", "", "12", "32", "100"));

        Contrats contrats = new Contrats(c, f, m, o);

        List<Contrats> contratsList = new ArrayList<>();
        contratsList.add(contrats);
        contratsList.add(contrats);
        return contratsList;
    }
}
