package utilities;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataExcelSheet {
    String fileName="./TestData/ReadData.xlsx";
    String sheetName="TestCaseReadData";

    @Test
    public void readData() throws IOException {

        FileInputStream fin=new FileInputStream(new File(fileName));
        XSSFWorkbook workbook=new XSSFWorkbook(fin);
        //use HSSFWorkbook if using old versions of office (.xls)
        XSSFSheet sheetInd=workbook.getSheetAt(1);  //reading sheet at index number  (sheet number 2)
        XSSFSheet sheetName=workbook.getSheet("TestCaseReadData");  //reading sheet using sheet name

        System.out.println(sheetInd.getLastRowNum());  //it returns the last row number
        System.out.println(sheetName.getLastRowNum());  //it returns last row number

        for(int i=1;i<=sheetInd.getLastRowNum();i++){
//        Row row=sheetInd.getRow(i);
            System.out.println("row Number" +i);
            System.out.println("Browser "+sheetInd.getRow(i).getCell(0));  //first column info
            System.out.println("environment "+sheetInd.getRow(i).getCell(1));
            System.out.println("username "+sheetInd.getRow(i).getCell(2));
        }
    }
}

//Assignment:
//Pageobject http://register.rediff.com/register/register.php?FormName=user_details
//testcase
//        firstname.clear()
//firstname.sendkeys(excelsheetvalue)



