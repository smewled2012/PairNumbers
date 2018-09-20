package com.objectoriented;

import java.util.Scanner;

public class BonusBous {
    public static void main(String[] args) {

        System.out.println("Welcome To BlackJack game !");
        BlackGame();

    }

    private static void BlackGame() {
        int add = 1, num1 = 0, num2 = 0;
        Scanner scan = new Scanner(System.in);  // instantaiting an object type scanner and assigning that to scan


        while(add!=0 && add<21){
            System.out.println("Please Enter the First number or J,  Q ,  K  or A  of your First Card !");
            String input1 = scan.nextLine();

            if (input1.equalsIgnoreCase("J") || input1.equalsIgnoreCase("Q") || input1.equalsIgnoreCase("K")){
                num1=10;
            }

            else if (input1.equalsIgnoreCase("A")){
                num1= BonusBonus();
            }
            else {
                num1= Integer.parseInt(input1);

            }
            System.out.println("Your first number you entered :"+ num1);

            System.out.println("Please Enter the Second number or J,  Q ,  K  or A  of your First Card !");
            String input2 = scan.nextLine();

            if (input2.equalsIgnoreCase("J") || input2.equalsIgnoreCase("Q") || input2.equalsIgnoreCase("K")) {
                num2=10;
            }
            else if (input2.equalsIgnoreCase("A")){
                num2= BonusBonus();
            }
            else{
                num2= Integer.parseInt(input2);
            }
            add=num1+num2;

            printSum(add);

        }
        System.out.println("Thank You For Playing Good Bye !!!!!");
    }

    private static void printSum(int sum1) {

        if(sum1==21){
            System.out.println(sum1 + " ****Congratulation *******");
        } else if (sum1 == 0) {
                System.out.println("Good Bye thanks For Playing the Game Over !!");
        } else {
                System.out.println("The sum is :" + sum1 + " You didn't win ! Please try again !");
            }


        }

    private static int BonusBonus() {
        int number;
        System.out.println("Please choose the value of A either 1 or 11");
        Scanner ainput= new Scanner(System.in);
        int avalue = ainput.nextInt();
        if(avalue==1){
            number =1;
        }
        else{
            number =11;
        }
        return  number;

    }
}
