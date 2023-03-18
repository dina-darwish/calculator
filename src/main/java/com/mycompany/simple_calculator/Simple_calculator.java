/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.simple_calculator;


import java.util.*;

public class Simple_calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter a sign such as + ,- ,* ,/ ");
        String sign = input.next();
        
        System.out.println("enter first number");
        int Fnum = input.nextInt();
        
        System.out.println("enter second number");
        int Snum = input.nextInt();
        
        
        switch (sign) {
            case "+":
                System.out.println("the result of " + Fnum + " + " + Snum  + " is " + (Fnum + Snum));
                break;
            case "-":
                System.out.println("the result of " + Fnum + " - " + Snum  + " is " + (Fnum - Snum));
                break;
            case "*":
                System.out.println("the result of " + Fnum + " * " + Snum  + " is " + (Fnum * Snum));
                break;
            case "/":
                System.out.println("the result of " + Fnum + " / " + Snum  + " is " + (Fnum / Snum));
                break;
            default:
                break;
        }
    }
}
