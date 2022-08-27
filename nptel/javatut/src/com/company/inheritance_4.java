package com.company;
//importing class from inheritance_2
public class inheritance_4 {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
                Box plainbox = new Box();
                double vol;
                vol = weightbox.volume();
                System.out.println("volume of weightbox is "+ vol);
                System.out.println("Weight of weightbox is "+ weightbox.weight);
                System.out.println();

                // assign BoxWeight reference to Box reference
        plainbox = weightbox;
        vol = plainbox.volume();//ok, volume is defined in box
        System.out.println("volume of wbox is "+ vol);
//        System.out.println("weight of box is "+ plainbox.weight);
//the following statement is invalid because plainbox does not define a weight member
    }
}
