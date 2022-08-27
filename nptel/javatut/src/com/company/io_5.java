package com.company;
//reading  full file
import java.io.FileInputStream;
public class io_5 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("test.txt");
            int i =0;
            while((i=fin.read())!=-1) {
                System.out.print((char) i);
            }
        }catch(Exception e){
        System.out.println(e);
    }
    }
}
