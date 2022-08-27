package com.company;

import java.io.*;

public class io_12 {
    public static void main(String[] args) throws IOException {
        //Declare file Streams
        FileInputStream file1=null;
        FileInputStream file2=null;

        SequenceInputStream file3=null;//declare file3
        //open the files to be concatenated
        file1 = new FileInputStream("test.txt");
        file2 = new FileInputStream("test2.txt");

        file3=new SequenceInputStream(file1,file2);//concatenated
        //create buffer input and output streams
        BufferedInputStream inBuffer = new BufferedInputStream(file3);
        BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);
        //read and write till the end of buffers
        int ch;
        while((ch=inBuffer.read())!=-1){
            outBuffer.write((char)ch);
        }
        inBuffer.close();
        outBuffer.close();
        file1.close();
        file2.close();
    }
}
