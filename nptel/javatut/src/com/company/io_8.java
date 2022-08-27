package com.company;
//copying a file into another file using Byte stream class
import java.io.*;

public class io_8 {
//copying a file into anothor file
//character stream class

        public static void main(String[] args) {

            //declare and cretea input and output files
            FileInputStream infile = null;
            FileOutputStream outfile =null;
            byte byteread;//declare a variable to hold a byte


            try {


                infile = new FileInputStream("test.txt");
                //opens infile
                outfile= new FileOutputStream("test2.txt");
                //opens outfile

                byteread= (byte)infile.read();
                while((byteread!=-1)){

                    outfile.write(byteread);
                    byteread= (byte)infile.read();
                }
                System.out.print("writing done");
            } catch (IOException e) {
                System.out.println(e);
                System.exit(-1);
            }finally{
                try{
                    infile.close();
                    outfile.close();
                }catch(IOException e){}
            }
        }
    }
