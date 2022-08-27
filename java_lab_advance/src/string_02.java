import java.util.*;
public class string_02 {
    public static void main(String[] args) {

        String s = "welcometojava";
        int count = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (s.length() - i > 2) {
                count++;
                System.out.print(s.substring(i, 3 + i));

            }
        }
        String array1[] = new String[count];
        for (int j = 0; j < s.length(); j++) {
            if (s.length() - j > 2) {
                array1[j] = s.substring(j, 3 + j);

            }
        }
        System.out.println(array1.length);
        for (int i = 0; i < array1.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array1.length; j++) {

                // Checking elements
                String temp = "0";
                if (array1[j].compareTo(array1[i])<0) {

                    // Swapping
                    temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }



    }
        System.out.println(array1[0]);
        System.out.println(array1[array1.length-1]);
}}