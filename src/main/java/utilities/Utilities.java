package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utilities {

    String fileName="./TestData/ReadData.xlsx";
    String sheetName="TestCaseReadData";
    FileInputStream fin;
    Workbook workbook;
    Sheet sheet;
    public ExtentReports extentReports;
    public ExtentHtmlReporter htmlReporter;
    public static ExtentTest test;

    public Object[][] readExcelData(String fileName, String sheetName) throws IOException, EncryptedDocumentException, InvalidFormatException {

        fin=new FileInputStream(new File(fileName));
        workbook= WorkbookFactory.create(fin);
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


    public String CaptureScreenshots(WebDriver driver, String screenName ) throws IOException {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //source
        String sreenshotPath=System.getProperty("user.dir")+"/screenshots/"+screenName+getCurrentDateTime()+".png";  //destination
        System.out.println(sreenshotPath);
        FileUtils.copyFile(src, new File(sreenshotPath) );
        return sreenshotPath;
    }

    public String getCurrentDateTime(){
        LocalDateTime ldt=LocalDateTime.now();
        DateTimeFormatter myFormat=DateTimeFormatter.ofPattern("ddMMMyyyy_HHmmss");
        String formattedDateTime=myFormat.format(ldt);
        System.out.println(formattedDateTime);
        return formattedDateTime;
    }


    public void initializeExtentReports(){
        String reportPath=System.getProperty("user.dir")+"/Reports/"+getCurrentDateTime()+".html" ;  //report path
        extentReports=new ExtentReports();  //start extents reports
        htmlReporter=new ExtentHtmlReporter(reportPath);  //start html reporter
        htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/src/main/resources/ReportConfig.xml");  //loading config file format
        extentReports.attachReporter(htmlReporter);
        extentReports.setSystemInfo("Environment","Stage");
        extentReports.setSystemInfo("Release version","3.5.6");
        extentReports.setSystemInfo("Executed by","Testet1");
        extentReports.setSystemInfo("Author","Tester2");


//        test=extentReports.createTest("testCase1");
//        test.pass("TestCase is passed");
//
//        test=extentReports.createTest("testCase2");
//        test.fail("Test case is failed");
    }
}


