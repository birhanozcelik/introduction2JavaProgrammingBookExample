/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontojavaprogramming;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class greatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("enter the first number: ");
        int number1 = scn.nextInt();
        
        System.out.println("enter the second number: ");
        int number2 = scn.nextInt();
        
        int gcd = 1;
        int k = 2;
        
        while(k <= number1 && k <= number2){
            if(number1 % k == 0 && number2 % k == 0){
                gcd = k;
            }
            k++;
        }
        
        System.out.println("the greatest coomon divisor for " +number1+ " and "+ number2+ " is " +gcd);
    }
    
}
