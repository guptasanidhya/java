import java.util.*;

public class sort {
    public static void main(String[] args) {
        int[] intArray = new int[]{4,3,5,6,3,2,1,7,8,9,0,6,5,4,3,2,4,5,6,7,8};
        ArrayList<Integer> list2 = new ArrayList<Integer>();
       for(Integer text:intArray) {
            list2.add(text);
       }
        System.out.println(list2);

       Collections.sort(list2);
        System.out.println(list2);

//        Collections.reverse(list2);
//        System.out.println(list2);

//        Collections.sort(list2, Collections.reverseOrder());
//        System.out.println(list2);
    }}
