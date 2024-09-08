package mypackage.java;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("enter first number");
        double firstNumber= 0;

        try{    firstNumber=getValidNumber(input);}
        catch(IllegalArgumentException error){
            System.out.println("only numbers are allowed");
        }


        System.out.println("enter valid operator");
        char obj=input.next().charAt(0);

        System.out.println("enter second number");
        double secondNumber=0;
        try{secondNumber=getValidNumber(input);}
        catch(IllegalArgumentException error){
            System.out.println("only numbers are allowed");
        }

        System.out.println("result is " + operate(firstNumber,obj,secondNumber));



        ;
    }
    private static double getValidNumber(Scanner scanner) {

        String input = scanner.next();
        if (input.matches("[a-zA-Z]+")) {
            IllegalArgumentException error=new IllegalArgumentException("Alphabetic characters are not valid numbers.");
            throw error;
        }
        double num = Double.parseDouble(input);


        return num;}






    public static double operate(double n1,char operator,double n2) {
    Calculation addition=new Sum();
    Calculation subtraction=new Subtraction();
    Calculation multiplication=new Multiplication();
    Calculation division=new Division();
    double result=0.0;
    switch (operator){
    case '+':
        result=addition.calculate(n1,n2);
        break;
    case '-':
        result= subtraction.calculate(n1,n2);
    break;
    case '*':
        result=multiplication.calculate(n1,n2);
    break;
    case '/':
        try
        {  result=division.calculate(n1,n2);}
        catch (ArithmeticException er){
            System.out.println("division by zero is not allowed");
        }
    break;
    default:
    System.out.println("invalid operator");

} return result;

}}