import java.io.*;
import java.util.*;

public class string_03 {

    public static void main(String[] args) {
        String A = "madame";
        /* Enter your code here. Print output to STDOUT. */
        String nstr = "";
        char ch;

        for (int i = 0; i < A.length(); i++) {
            ch = A.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println(nstr);
    }
}





