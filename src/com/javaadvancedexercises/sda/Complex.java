package com.javaadvancedexercises.sda;

import java.util.Scanner;

// print the sum, difference and product of two complex numbers ny creating a class "Complex'
//with separate methods for each operation whose real and imaginary parts are entered by
//*complex numbers are numbers that have a real part and an imaginary one*//
public class Complex {
    public static class ComplexNumber{
        double real;
        double imaginary;
        ComplexNumber(){}
        ComplexNumber (double real, double imaginary){
            this.real = real;
            this.imaginary = imaginary;
        }
    }

    public static ComplexNumber shuma (ComplexNumber a, ComplexNumber b){
        ComplexNumber shuma = new ComplexNumber();
        shuma.real = a.real + b.real;
        shuma.imaginary = a.imaginary + b.imaginary;
        return shuma;
    }

    public static ComplexNumber zbritja (ComplexNumber a, ComplexNumber b){
        ComplexNumber zbritja = new ComplexNumber();
        zbritja.real = a.real - b.real;
        zbritja.imaginary = a.imaginary - b.imaginary;
        return zbritja;
    }
    public static ComplexNumber prodhimi (ComplexNumber a, ComplexNumber b){
        ComplexNumber prodhimi = new ComplexNumber();
        prodhimi.real = a.real * b.real;
        prodhimi.imaginary = a.imaginary*b.imaginary;
        return prodhimi;
    }
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        ComplexNumber a = new ComplexNumber();
        ComplexNumber b = new ComplexNumber();
        System.out.println ("Vendos numrin e pare complex: \nreal: ");
        a.real = input.nextDouble();
        System.out.println ("\nimaginary: ");
        a.imaginary = input.nextDouble();
        System.out.println ("Vendos numrin e dyte complex: \nreal: ");
        b.real = input.nextDouble();
        System.out.println ("\nimaginary : ");
        b.imaginary = input.nextDouble();

        ComplexNumber prgj1 = shuma(a, b);
        System.out.println ("Shuma e numrave complex eshte: " + shuma(a,b).real + shuma(a,b).imaginary);
        ComplexNumber prgj2 = zbritja(a,b);
        System.out.println ("Zbritja e numrave complex eshte: " + zbritja(a,b).real + zbritja(a,b).imaginary);
        ComplexNumber prgj3 = prodhimi(a,b);
        System.out.println ("Prodhimi i numrave complex eshte: " + prodhimi(a,b).real + prodhimi(a,b).imaginary);
    }

}

