package com.company;
import java.io.*;
public class io_6 {
    public static void getPaths (File f) throws IOException{
        System.out.println("name : "+f.getName());
        System.out.println("path : "+f.getPath());
        System.out.println("Parent : "+f.getParent());
    }
    public static void getInfo (File f) throws IOException{
        if (f.exists()){
            System.out.println("FIle exists");
            System.out.println(f.canRead()? "and is readable:" :" ");
            System.out.println(f.canWrite()? "and is writeable:" :" ");
            System.out.println("File is last modified:"+f.lastModified());
            System.out.println("file is "+f.length()+"bytes");
        }
        else
            System.out.println("file does not exists");
    }

    public static void main(String[] args) throws IOException{
        File filetocheck;
        if (args.length>0){
            for (int i =0;i<args.length;i++){
                filetocheck = new File(args[i]);
                getPaths(filetocheck);
                getInfo(filetocheck);
            }
        }
        else
            System.out.println("usage : java file test <filename (s)>");
    }
}
