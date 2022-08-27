package com.company;
//single inheritance
interface i7{
    double x =4.444;
    void methodi7();//public static by default
}
interface i77 extends i7{
    double y=555;
    void methodi7();//public static by default
}

class i777 implements i77 {
    public int a1=555;
    public void methodi7(){
        System.out.println("From i7 "+x+y);
    }

    public void methodi77(){
        System.out.println("From i77 "+x+y);
    }
}
 public  class interface_7{
     public static void main(String[] args) {
         i777 a = new i777();
         a.methodi7();
         a.methodi77();
     }
 }