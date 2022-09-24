package com.javaadvancedexercises.sda;
//write a program to print the area and perimeter of a triangle
//having sides 3,4 and 5 units by creating a class named "Triangle" without any parameter in its constructor
class Triangle {
    int s1= 3;
    int s2 = 4;
    int s3 = 5;

    public static void main (String [] args){
        Triangle t1 = new Triangle();
        int perimetri = (t1.s1 + t1.s2+ t1.s3);
        System.out.println ("Perimetri eshte " + perimetri);

        int sidePerimeter = (perimetri/2);
        int area = ((((sidePerimeter* (sidePerimeter-t1.s1))*(sidePerimeter- t1.s2))*(sidePerimeter-t1.s3)));
        int area1 = (int)Math.sqrt(area);
        System.out.println ("Siperfaqja eshte " + area1);
    }
}
