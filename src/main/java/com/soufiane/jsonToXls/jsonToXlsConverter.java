package com.soufiane.jsonToXls;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

public class jsonToXlsConverter {
    public static void main(String[] args) throws IOException {
        /*String json = "{\"name\": \"Bob\", \"id\": \"123\"}";

        // Method 1: parsing into a JSON element
        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        System.out.println(jsonObject.get("name").getAsString());

        // Method 2: parsing into a Java Object
        User user = new Gson().fromJson(json, User.class);
        System.out.println(user.id);*/

        JSONParser parser = new JSONParser();

        String name = "";
        String author = "";
        Iterator<String> iterator = null;
        try {

            Object obj = parser.parse(new FileReader("/home/soufiane/Documents/massInject/ahhaa.json"));

            JSONObject jsonObject2 = (JSONObject) obj;

            name = (String) jsonObject2.get("Name");
            author = (String) jsonObject2.get("Author");
            JSONArray companyList = (JSONArray) jsonObject2.get("Company List");

            System.out.println("Name: " + name);
            System.out.println("Author: " + author);
            System.out.println("\nCompany List:");
            iterator = companyList.iterator();
            /*while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        }

        //xls part ================================================
        Workbook workbook = new HSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

        /* CreationHelper helps us create instances of various things like DataFormat,
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Contrats");

        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        /*Row headerRow = sheet.createRow(0);

        // Create cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }*/

        // Create Cell Style for formatting Date
        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

//--------------------------------------------------------------
        Row row = sheet.createRow(0);

        row.createCell(0)
                .setCellValue(name);

        row.createCell(1)
                .setCellValue(author);

        Cell date = row.createCell(2);
        date.setCellValue(new Date());
        date.setCellStyle(dateCellStyle);

        int i = 3;
        while (iterator.hasNext()) {
            row.createCell(i++)
                    .setCellValue(iterator.next());
        }

//------------------------------------------------------------------
        // Create Other rows and cells with employees data
        /*int rowNum = 1;
        for(Employee employee: employees) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(employee.getName());

            row.createCell(1)
                    .setCellValue(employee.getEmail());

            Cell dateOfBirthCell = row.createCell(2);
            dateOfBirthCell.setCellValue(employee.getDateOfBirth());
            dateOfBirthCell.setCellStyle(dateCellStyle);

            row.createCell(3)
                    .setCellValue(employee.getSalary());
        }*/

        // Resize all columns to fit the content size
        for(int j = 0; j < 10; j++) {
            sheet.autoSizeColumn(j);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("/home/soufiane/Documents/massInject/ahhaa.xls");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();
    }
}
