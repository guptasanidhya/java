package com.company;

import java.io.*;

public class io_2 {
    public static void main(String[] args) {
        byte cities[] = {'D', 'E', 'L', 'H', 'I', ' ', 'M', 'A', 'D', 'R', 'A', 'S'};
        try {
            FileOutputStream outfile = null;
            outfile = new FileOutputStream("city.txt");
            outfile.write(cities);
            outfile.close();
        }
        catch(IOException ioe){
            System.out.println(ioe);
            System.exit(-1);
        }
    }
}
