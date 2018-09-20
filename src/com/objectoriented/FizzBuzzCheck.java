package com.objectoriented;

/* write a program of fizz buzz
if the input number is divisible by 3 we call it Fizz and if by 5 we call it buzz
if the number is divisible by both 3 and 5 we call it fizzbuzz
*
* */

import java.util.Scanner;

public class FizzBuzzCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you wanna Check !");
        int number= scan.nextInt();     // input a number from user

        FizzBuzz(number);      // calling a method FizzBuzz

    }

    private static void FizzBuzz(int number) {
        int count =1;           // set a counter
        while(count<=number){

            if(count%3==0 && count%5==0) {
                System.out.print(" FizzBuzz ");     //if count divisible by 5 and 3 replace with fuzzbuzz
            }
            else if(count %3==0){
                System.out.print(" Fizz");        // if divisible by 3 replace count with fizz
            }
            else if(count%5==0){
            System.out.print(" Buzz");              // if divisible by 5 replace count with Buzz
            }
            else {

                System.out.print(" " + count + " ");
            }
            count++;
        }


    }
}

//