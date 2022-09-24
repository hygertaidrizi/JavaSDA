package com.JavaAdvanced.sda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ShkodraInputStreamExample {
    public static void main(String[] args) {

        try {

            //perdoret per te lexuar nga file
            FileInputStream inputStream = new FileInputStream("user.txt");
            //perdoret per te shkruar nga file
            FileOutputStream outputStream = new FileOutputStream("ergys.txt");


            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.println((char)c);
                outputStream.write(c);
            }
            System.out.println("Mbaroi programi");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}








