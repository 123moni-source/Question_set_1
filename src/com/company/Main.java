package com.company;
import java.util.Scanner;
class box {
    public float length;
    public float breadth;
    public float height;
    public box(float length,float breadth,float height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public void display()
    {
        float area, volume;
        area=2*(length*breadth+breadth*height+height*length);
        volume=length*breadth*height;
        System.out.println(area);
        System.out.println(volume);
    }
    class box3d extends box {
        box3d(float length, float breadth, float height) {

            super(length, breadth, height);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float length=sc.nextFloat();
        float breadth=sc.nextFloat();
        float height=sc.nextFloat();
        box obj=new box(length,breadth,height);
        obj.display();
    }
}

