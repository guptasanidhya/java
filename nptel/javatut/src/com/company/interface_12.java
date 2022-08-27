package com.company;

import java.awt.*;

interface GeoAnalyzer{
    final static float pi = 3.142F;
    float area();
    float perimeter();
}
/////////////////////////////////////////////////
class Circlei12 implements GeoAnalyzer{
    float radius;
    public Circlei12(float r){
        radius = r;
    }
    public float area(){
        return (pi*radius*radius);
    }
    public float perimeter(){
        return (2*pi*radius);
    }
}
/////////////////////////////////////////////////////
class Rectanglei12 implements GeoAnalyzer{
    float length;
    float width;
    public Rectanglei12(float l,float w){
        length=l;
        width=w;
    }
    public float area(){
        return (length*width);
    }
    public float perimeter(){
        return (2*(length*width));
    }
}
////////////////////////////////
public class interface_12 {
    static void display(float x , float y){
        System.out.println("Area ="+x+"Perimeter="+y);
    }
    public static void main(String args[]){
        Circlei12 c = new Circlei12(5.2f);
        Rectanglei12 r = new Rectanglei12(4.5f,3.6f);
        GeoAnalyzer geoitem;
        geoitem =c ;
        display(geoitem.area(), geoitem.perimeter());
        geoitem=r;
        display(geoitem.area(), geoitem.perimeter());
    }
}
