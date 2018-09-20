package com.objectoriented;



import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you wanna Check !");
        int num= input.nextInt();
        EvenOddCheck(num);
    }


    private static void EvenOddCheck(int num) {

        int result;
        if(num%2==0){
            System.out.println(num + " This is an Even Number !");

        }
        else{
            System.out.println(num+ " This is an Odd Number !");
        }
    }


}

