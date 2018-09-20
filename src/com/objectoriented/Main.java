package com.objectoriented;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Card Numbering Game !");

        int sum=1;
        int number1=0, number2=0;

        Scanner input = new Scanner(System.in);

        while(sum!=0&&sum<21) {

            System.out.println("Please Enter the number or J,  Q ,  K  or A  of your First Card !");
            // what kind of input
            String firstinput = input.next();

//            System.out.println("Print the converted value "+ row1);
           if(firstinput.equalsIgnoreCase("J") || firstinput.equalsIgnoreCase("Q") || firstinput.equalsIgnoreCase("K")){
                number1 = 10;
               //int row1 = Integer.parseInt(firstinput);
           }
           else if(firstinput.equalsIgnoreCase("A")){
               number1 = 11;
           }
           else{
               number1 =Integer.parseInt(firstinput);
           }
            System.out.println("The First Entered number will be :"+ number1);

            System.out.println("Please Enter the number or  J,  Q ,  K  or A of your Second Card !");
           // int number2 = input.nextInt();
            String secondinput = input.next();

            if(secondinput.equalsIgnoreCase("J")|| secondinput.equalsIgnoreCase("Q") || secondinput.equalsIgnoreCase("K")){
                number2 = 10;
                //int row1 = Integer.parseInt(secondinput);
            }
            else if(secondinput.equalsIgnoreCase("A")){
                System.out.println("Please select 1 or 11 for the Letter A");
                int avalue = input.nextInt();
                if(avalue==1){
                    number2 = 1;
                }
                else{
                    number2=11;
                }

            }
            else{
                 number2 = Integer.parseInt(secondinput);

            }
            System.out.println("The Second Entered number will be :"+ number2);



            sum = number1 + number2;
            if (sum == 21) {
                System.out.println(sum + " ****Congratulation ***********");

            } else if (sum == 0) {
                System.out.println("Good Bye thanks For Playing the Game Over !!");
            } else {
                System.out.println("The sum is :" + sum + " You didn't win ! Please try again !");

            }


            System.out.println("Thank You For Playing Good Bye !!!!!");

        }
    }
}
