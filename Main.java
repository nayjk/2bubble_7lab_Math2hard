package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double summa = 0;
        int n = in.nextInt ();
        System.out.println("n = " + n);
        int x = in.nextInt ();
        System.out.println("x = " + x);
        if (x<1) {
System.out.println("Неверное значение");
        }
        else{
for (var j = 0; j <= n; j++) {
double arthx = (1 / (2 * n + 1) * (Math.pow(x, 2 * n + 1)));
summa = summa + arthx;
       }
System.out.println(summa);
    } 
if (n<0){
System.out.println("Неверное значение");
   }
  }
} 
