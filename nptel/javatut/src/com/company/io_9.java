package com.company;
//example of buffered output stream class for writing into a file
import java.io.*;
import java.nio.charset.StandardCharsets;

public class io_9 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("test.txt");
        BufferedOutputStream bout =new BufferedOutputStream(fout);
        String s = "Welcome to Nptel";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.print("Success");

    }
}
