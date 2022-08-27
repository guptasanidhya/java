package com.company;
class Boxx{
    double width;
    double height;
    double depth;

    Boxx(){
        width=0.0;
        height=0.0;
        depth=0.0;

    }
    Boxx(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    double volume(){
        return width*height*depth;
    }
}
//here box is extended to include weight.
class BoxxWeight extends Boxx{
    double weight;

    //constructor for BoxWeight
    BoxxWeight(){
        super();//call the default constructor in the subclass of super class
        weight=0.0;
    }
    BoxxWeight(double w,double h, double d,double m){
        super(w,h,d);//call the overloaded constructor in the super class
        weight=m;
    }
}
public class inheritance_3 {
    public static void main(String[] args) {
        Boxx mybox1 = new Boxx(10,20,15);
        BoxxWeight mybox2 = new BoxxWeight(2,3,4,0.076);
        double vol;
        vol=mybox1.volume();
        System.out.println("volume of mybox1:"+vol);
        //System.out.println("Weight of mybox1.weight);ERROR!
        System.out.println();

        vol=mybox2.volume();
        System.out.println("Volume of mybox2 is "+mybox2.volume());
        System.out.println("weight of mybox2 is " + mybox2.weight);

    }
}
