package org.mfon;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        // initialization of Scanner class
        Scanner userInput = new Scanner(System.in);

        // 1. Ask a user to enter an operation: (+) or (-) or (*) or (/)
        System.out.println("Choose an Operation: +, -, *, /");
        char operator = userInput.next().charAt(0);

        // 2. ask the user to enter the first number
        double  number1, number2;
        System.out.println("Enter the first number");
        while (true){
            if(userInput.hasNextDouble()){
                number1 = userInput.nextDouble();
                break;
            }else{
                System.out.println("Please Enter a correct number");
                userInput.next();
            }
        }

        // 3. ask the user to enter the second number
        System.out.println("Enter the second number");
        while (true){
            if(userInput.hasNextDouble()){
                number2 = userInput.nextDouble();
                break;
            }else{
                System.out.println("Please Enter a correct number");
                userInput.next();
            }
        }

        // check the operator entered by the user, then compute result
        double result;

        switch (operator){

            // performs addition between number1 and number2
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("You entered an invalid operator!");
                break;
        }

    }
}