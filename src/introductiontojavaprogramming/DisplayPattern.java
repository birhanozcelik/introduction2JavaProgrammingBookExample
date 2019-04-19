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
public class DisplayPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number : ");
        int number = scn.nextInt();
        displayPattern(number);
        
        
    }
    
    public static void displayPattern(int number){
        for(int i = number-1 ; i>=0 ; i--){
            for(int j = 1 ; j <= number-i ; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
