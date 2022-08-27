
public class assignment_3 {
    public static void main(String[] args) {
        int a[]={40,20,30,70,10};
        float largest;
        float smallest;
        int rounds=0;
        for(int i = 0 ; i<a.length;i++) {
            rounds++;
            boolean flag = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    flag = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if (flag==false){
                break;
            }
        }
        System.out.println("No of rounds:"+rounds);
        for(int i = 0 ; i<a.length;i++) {
                System.out.println(a[i]);
            }
        System.out.println("Smallest Number:"+a[0]);
        System.out.println("Largest Number:"+a[a.length-1]);
        }


}

