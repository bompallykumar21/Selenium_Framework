package utilities;

import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;

public class ReadDataNotepad {


    String fileLoc="./TestData/ReadData.txt";


    @Test
    public void readTextFile() throws IOException {

        FileReader reader = new FileReader(fileLoc);
        int i;
         while((i=reader.read())!=-1){
            System.out.print((char)i);
        }
    }


}
