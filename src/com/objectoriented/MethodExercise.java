package com.objectoriented;
import java.util.Scanner;


public class MethodExercise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Float number ");
        double num = input.nextDouble();

        double y = divideByThree(num);

        System.out.println("I divide "+ num +" by 3 "+ "my output is "+ y);

    }

    private static double divideByThree(double number) {
        double result = number/3;
        return  result;

    }
}
