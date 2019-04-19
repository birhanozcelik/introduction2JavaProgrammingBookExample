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
public class multiplyDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the value : ");
        long value = scn.nextLong();
        System.out.println(value+ " is : " +mulDigits(value));
        
    }
    
    
    public static int mulDigits(long n){
        int x = 1;
            while(n >= 10){
                x *= n%10;
                n = n/10;
            }
            x*=n;
            
            
            return x;
            
    }
}
