package mypackage.java;

import java.util.Scanner;

public abstract class Calculation {
   double a;
   double b;



   public double getA() {
      return a;
   }

   public abstract double calculate(double a, double b);
}
