package utilities;

import org.testng.annotations.Test;

import java.io.*;

public class WriteDataNotepad {

    String fileLoc="./TestData/WriteData2.txt";


   @Test
    public void readTextFile() throws IOException {

       FileWriter writer = new FileWriter(fileLoc, true);  //appends to the existing file
       writer.write("This is file writing demo");
       writer.write("This is file writing demo2");
       writer.close();

        }
    }

