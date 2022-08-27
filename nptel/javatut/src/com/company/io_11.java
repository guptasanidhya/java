package com.company;
import java.io.*;
public class io_11 {
    public static void main(String[] args) throws Exception{
        FileInputStream input1=new FileInputStream("test.txt");
        FileInputStream input2=new FileInputStream("test2.txt");
        SequenceInputStream inst=new SequenceInputStream(input1,input2);
                int j;
        while((j=inst.read())!=-1){
            System.out.print((char)j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}
