package utilities;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataExcelSheet {
	String fileName="./TestData/ReadData.xlsx";
	String sheetName="TestCaseReadData";
	FileInputStream fin;
	Workbook workbook;
	Sheet sheet;

	public void readData() throws IOException {
		fin=new FileInputStream(new File(fileName));
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		//use HSSFWorkbook if using old versions of office (.xls)
		XSSFSheet sheetInd=workbook.getSheetAt(1);  //reading sheet at index number  (sheet number 2)
		XSSFSheet sheetName=workbook.getSheet("TestCaseReadData");  //reading sheet using sheet name

		System.out.println(sheetInd.getLastRowNum());  //it returns the last row number
		System.out.println(sheetName.getLastRowNum());  //it returns last row number

		for(int i=1;i<=sheetInd.getLastRowNum();i++){
			//        Row row=sheetInd.getRow(i);
			System.out.println("row Number" +i);
			System.out.println("Browser# "+sheetInd.getRow(i).getCell(0));  //first column info
			System.out.println("environment# "+sheetInd.getRow(i).getCell(1));
			System.out.println("username# "+sheetInd.getRow(i).getCell(2));
		}
		fin.close();
	}



	//using object array
	public Object[][] readExcelData(String fileName, String sheetName) throws IOException, EncryptedDocumentException, InvalidFormatException {

		fin=new FileInputStream(new File(fileName));
		workbook=WorkbookFactory.create(fin);
		sheet=workbook.getSheet(sheetName); 

		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];  //defining array size with total rows
		//and total columns

		System.out.println(sheet.getLastRowNum());  //it returns the last row number
		System.out.println(sheet.getRow(0).getLastCellNum());  //it returns last column number

		for(int r=0;r<sheet.getLastRowNum();r++){
			for (int c=0;c<sheet.getRow(0).getLastCellNum();c++) {
				data[r][c]=sheet.getRow(r+1).getCell(c).toString();
//				System.out.println("row num: "+r);
//				System.out.println("col num: "+c);
//				
//				System.out.println("Value in excel sheet "+data[r][c]);

			}

		}
		return data;
	}
}

//Assignment:
//Pageobject http://register.rediff.com/register/register.php?FormName=user_details
//testcase
//        firstname.clear()
//firstname.sendkeys(excelsheetvalue)



