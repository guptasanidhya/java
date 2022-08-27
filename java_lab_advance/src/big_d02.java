import java.math.*;
public class big_d02 {
    public static void main(String[] args) {
        String a="101.00001";
        String c="101.00005";
        String d="101.00006";
        String[] my ={"9",
                "-100",
                "50",
                "0",
                "56.6",
                "90",
                "0.12",
                ".12",
                "02.34"
                        ,"000.000"};
        int n =10;
//        for (int i =0;i< my.length;i++){
//            for(int j=i+1;j<my.length;j++) {
//                if(new BigDecimal(my[j]).compareTo(new BigDecimal(my[i])) == 0){;
//                }
//                else if (new BigDecimal(my[j]).compareTo(new BigDecimal(my[i])) > 0) {
//                    String temp = "0";
//                    temp = my[i];
//                    my[i] = my[j];
//                    my[j] = temp;
//                }
//
//            }
//        }


        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < (n-i); j++) {
                BigDecimal sj = new BigDecimal(my[j]);
                BigDecimal sj1 = new BigDecimal(my[j-1]);
                System.out.println(sj1+" "+sj);
                System.out.println("comparing");
                if(sj.compareTo(sj1) > 0){
                    String temp = my[j];
                    my[j] = my[j-1];
                    my[j-1] = temp;
                    System.out.println("after comparing"+ my[j-1]+" "+my[j]);

                }
            }
        }
//        for(int i=0;i<my.length;i++){
//            System.out.println(my[i]);
//        }
//        System.out.println(my.length);
    }
}
