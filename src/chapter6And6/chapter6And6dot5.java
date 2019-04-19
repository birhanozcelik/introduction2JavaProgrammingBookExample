/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6And6;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class chapter6And6dot5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter first number : ");
        int number1 = scn.nextInt();
        System.out.println("enter second number: ");
        int number2 = scn.nextInt();
        System.out.println("enter thirth number: ");
        int number3 = scn.nextInt();
        displaySortedNumbers(number1, number2, number3);
        
    }
    
    public static void displaySortedNumbers(int number1, int number2 , int number3){
        if(number1 > number2 && number1>number3){
            if(number2 > number3){
                System.out.println(number1+" "+number2+" "+number3);
            }
            else
                System.out.println(number1+" "+number3+" "+number2);
        }
        else if (number2 > number1 && number2 > number3){
            if(number1>number3)
                System.out.println(number2+" "+number1+" "+number3);
            else
                System.out.println(number2+" "+number3+" "+number1);
        }
        else if(number3 > number1 && number3 > number2){
            if(number1 > number2)
                System.out.println(number3+" "+number1+" "+number2);
            else
                System.out.println(number3+" "+number2+" "+number1);
        }
        else
            System.out.println(number1+" "+number2+" "+number3);
        
        
    }
    
}
