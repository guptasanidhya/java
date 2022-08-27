package com.company;
import java.io.*;
public class io_13 {
    public static void main(String[] args) {
        RandomAccessFile file = null;
        try{
            file = new RandomAccessFile("rand.txt","rw");
            //writing to the file
            file.writeChar('x');
            file.writeInt(555);
            file.writeDouble(3.1412);
            file.seek(0);//go to the beginning
            //reading from the file
            System.out.println(file.readChar());
            System.out.println(file.readInt());
            System.out.println(file.readDouble());
            file.seek(2);//go to second item
            System.out.println(file.readInt());
            //go to the end and append false to the file
            file.seek(file.length());
            file.writeBoolean(false);
            file.seek(4);
            System.out.println(file.readBoolean());
            file.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
