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
 * if ve else kullanımı olmadan yapılmıstır...
 */
public class chapter2exercises26 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter a number between 0 and 1000: ");
        int input = scn.nextInt();
        int one = input%10;
        int two = input/10;
        int three = two%10;
        int four = two/10;
        int multiply = one*three*four;
        System.out.println(multiply);
        
        
        
        
    }
    
}
