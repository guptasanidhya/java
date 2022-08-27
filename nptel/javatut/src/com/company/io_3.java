package com.company;
//writing a string into a file
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class io_3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("test.txt");
            String s = "Welcome to nptel!";
            byte b[] = s.getBytes();
            //converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("file writing is over");
        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
