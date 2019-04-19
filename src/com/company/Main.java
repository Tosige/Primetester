package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Variables
        int count;
        int count2;
        int input;
        boolean prime = false;

//User inputs random numner
        System.out.print("Enter a random number: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();

        //while (input >= 1){
        //Nested For Loop, the first to count from 2 to entered number
        // and second for modulus calculations
        for (count = 1; count <= input; count++) {

            //Add a new variable that lets the 1st for loop know it's done

            for (count2 = 2; count2 <= (input / 2); count2++) {

                //If a number n returns a modulus = 0 when divided by any number
                //between 2 and half it's value( rounded int), it is not a prime number
                if (input % count2 == 0) {
                    prime = false;
                    break;
                }
            }

            if (count <= 1){
                System.out.println("1 is not a prime number");
            }else if (prime) {
                System.out.println(count + " is not a prime number");
            } else
                System.out.println(count + " is a prime number");
        }
    }
}