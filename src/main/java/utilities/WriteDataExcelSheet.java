package utilities;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import testBase.TestBase;

import java.io.*;

public class WriteDataExcelSheet {


    @Test
    public void writeDataToExcel() throws IOException {
        String fileName = "./TestData/WriteData.xlsx";
        String sheetName = "TestCaseWriteData";
        FileInputStream fin = new FileInputStream(new File(fileName));

        XSSFWorkbook workbook = new XSSFWorkbook(fin);
        //use HSSFWorkbook if using old versions of office (.xls)
        XSSFSheet sheetInd = workbook.getSheetAt(1);  //reading sheet at index number  (sheet number 2)
        XSSFSheet sheet = workbook.getSheet(sheetName);  //reading sheet using sheet name
        int lastRow=sheet.getLastRowNum();

    System.out.println("Lat row number is: "+lastRow);
        sheet.createRow(lastRow+1).createCell(0).setCellValue("pol-12345");  //writing data to second row and first column
        System.out.println("Writing data to last row");
        FileOutputStream fout=new FileOutputStream(fileName);
        workbook.write(fout);
        fout.close();
    }
}