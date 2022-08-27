package com.company;
//Inheritance example : initialisation through constructor
class Box{ //Default setting by this constructor
    double width;
    double height;
    double depth;

    Box(){
        width=0.0;
        height=0.0;
        depth=0.0;

    }
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    double volume(){
        return width*height*depth;
   }
}
//here box is extended to include weight.
class BoxWeight extends Box{
    double weight;

    //constructor for BoxWeight
    BoxWeight(double w,double h, double d,double m){
        width=w;
        height=h;
        depth=d;
        weight=m;
    }
}
public class inheritance_2 {
    public static void main(String[] args) {
        Box mybox1= new Box();
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("volume of box1 is" + vol);
        System.out.println("weight of box2 is "+ mybox2.volume());
        System.out.println("weight of box2 is "+ mybox2.weight);
    }
}
