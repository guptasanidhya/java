package com.company;
class Box7{
    private double width;
    private double height;
    private double depth;

    //constructor used when all dimensions specified
    Box7(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }

    //compute and return volume
    double volume(){
        return width*height*depth;
    }
}
//Add weight.
class BoxWeight7 extends Box7{
    double weight; //weight of box
    BoxWeight7(double w,double h, double d, double m){
        super(w,h,d);
        weight = m;
    }
}

class Shipment extends BoxWeight7{
    double cost;
    Shipment(double w, double h, double d,double m,double c){
        super(w,h,d,m);
        cost=c;
    }
}
public class inheritance_7 {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(1,2,1,5,3);
        double vol;
        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is "+ vol);
        System.out.println("Weight of shipment1 is "+ shipment1.weight);
        System.out.println("shipping cost:$"+ shipment1.cost);
        System.out.println();
        vol= shipment2.volume();
        System.out.println("Volume of Shipment2 is "+ vol);
        System.out.println("Weight of Shipment2 is "+ shipment2.weight);
        System.out.println("Shipping cost: $ "+ shipment2.cost);




    }
}
