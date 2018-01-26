package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // take user input from 1-100 if its multiple of 3 output fizz if its multiple of 5 out buzz if neither output their number


        System.out.println("pick a number up to 100");

        Scanner user = new Scanner(System.in);


        int u;
        u = user.nextInt();


        int Max = 100;
        int Min = 1;


        if (u > 0 && u <= 100) {

            if (u % 3 == 0 && u % 5 == 0) {
                System.out.println("fizz buzz");


            } else if (u % 3 == 0) {
                System.out.println("fizz");

            } else if (u % 5 == 0) {

                System.out.println("buzz");
            }
        } else if (u > 100)
        {
            System.out.println(u);

        }



        System.out.println("please enter your grade");

        Scanner grade = new Scanner(System.in);
        int g;
        g = grade.nextInt();


        if (g >= 80){
            System.out.println("you got an A!");
        }else if(g <= 79 || g>= 60) {
            System.out.println("you got an B!");
        }else if(g <= 59 || g >= 50)  {
            System.out.println("you got an C!");
        }else if(g <= 49 || g >=45 ) {
            System.out.println("you got an D!");
        }else if(g < 45) {
            System.out.println("you got an F!");

        }

        System.out.println("Good job!");












    }
}
