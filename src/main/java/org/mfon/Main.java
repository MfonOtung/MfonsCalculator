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

        if(operator == '+' || operator == '-' || operator == '*' || operator == '/'){
            System.out.println("You chose the operator: "+operator);
        }else{
            System.out.println("You entered a wrong operator!");
        }
        // 2. ask the user to enter the first number
        System.out.println("Enter the first number");
        double number1 = userInput.nextDouble();

        // 3. ask the user to enter the second number
        System.out.println("Enter the second number");
        double number2 = userInput.nextDouble();

        // TODO: check the operaton entered by the user, then compute result

        if(operator == '+'){
            double result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        }else if(operator == '-'){
            double result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        } else if(operator == '/') {
            double result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        } else if (operator == '*') {
            double result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
        }
    }
}