package com.company;
//reading a single character from a file
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class io_4 {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("test.txt");
            int i = fin.read();
            System.out.println((char)i);
            fin.close();
        }catch(Exception e){ }
    }
}
