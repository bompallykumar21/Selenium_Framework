package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import utilities.ReadDataExcelSheet;

public class TestCasetoGetDataFromExcelSheet {

	@Test
	public void testcase() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		ReadDataExcelSheet obj=new ReadDataExcelSheet();
		String fileName="./TestData/ReadData.xlsx";
		String sheetName="TestCaseReadData";
		Object[][] dataFromExcelSheet=obj.readExcelData(fileName, sheetName);
		
		for(int r=0;r<dataFromExcelSheet.length;r++){
						
				System.out.println("Value in first column# "+dataFromExcelSheet[r][0]);
				System.out.println("Value in second column# "+dataFromExcelSheet[r][1]);

			}
		
		
	}	
}
