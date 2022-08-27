package com.company;
//copying a file into anothor file
//character stream class
import java.io.*;
public class io_7 {
    public static void main(String[] args) {

        //declare and cretea input and output files
        File infile = new File("test.txt");
        File outfile = new File("test2.txt");

        FileReader ins=null ;//Create file stream ins
        FileWriter outs=null ;
        //Creates file Stream outs

        try {

                    ins = new FileReader(infile);
                    //opens infile
                    outs=new FileWriter(outfile);
                    //opens outfile
            int ch; //read and write till the end
            while((ch=ins.read())!=-1){

                outs.write(ch);
                System.out.print((char)ch);
            }
            System.out.print("writing done");
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        }finally{
            try{
                ins.close();
                outs.close();
            }catch(IOException e){}
        }
    }
}