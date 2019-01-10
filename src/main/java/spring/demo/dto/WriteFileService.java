package spring.demo.dto;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WriteFileService {

    public static void writeFile(String text) throws FileNotFoundException, UnsupportedEncodingException {

        String a = new String(text.toCharArray(),0,1 );
        System.out.println(a);
        String name = "situation.txt";
        PrintWriter writer = new PrintWriter(name, "UTF-8");
        writer.println(text);

        writer.close();
    }
}