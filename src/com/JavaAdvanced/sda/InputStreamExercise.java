package com.JavaAdvanced.sda;
import java.io.*;
import java.util.Scanner;

//krijo nje program qe ruan ne file te dhenat e marr nga scanner
public class InputStreamExercise {
            public static void main(String[] args) throws IOException {
                Scanner input = new Scanner(System.in);
                FileOutputStream outputStream = new FileOutputStream("shkodra.txt");

                System.out.println("Shkruani nje fjale");
                outputStream.write(input.nextInt());

            }
        }

