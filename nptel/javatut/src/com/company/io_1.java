package com.company;
import java.io.FileOutputStream;
public class io_1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("test.txt");
            fout.write(65);
            fout.close();
            System.out.println("File writing is over");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
