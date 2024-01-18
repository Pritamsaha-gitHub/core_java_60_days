package com.example.Core.Java.File_Input_Output;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReadWrite {
    public static void main(String[] args) throws Exception{



//        FileInputStream file = new FileInputStream();
        Workbook workbook = new XSSFWorkbook();

        // Create a sheet in the workbook
        Sheet sheet = workbook.createSheet("Sheet1");

        // Write data to the sheet
        writeData(sheet);

        // Save the workbook to a file
        try (FileOutputStream fileOut = new FileOutputStream("D:\\Personal\\60_Days_Java\\core_java_60_days\\Core-Java\\src\\main\\java\\com\\example\\Core\\Java\\File_Input_Output\\excelFile.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the workbook to release resources
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeData(Sheet sheet) {
        // Create a row in the sheet
        Row row = sheet.createRow(0);

        // Create cells in the row and write data
        Cell cell1 = row.createCell(0);
        cell1.setCellValue("Name");

        Cell cell2 = row.createCell(1);
        cell2.setCellValue("Age");

        // Create another row
        Row row2 = sheet.createRow(1);

        // Write data to the second row
        Cell cell3 = row2.createCell(0);
        cell3.setCellValue("John Doe");

        Cell cell4 = row2.createCell(1);
        cell4.setCellValue(30);
    }


}
