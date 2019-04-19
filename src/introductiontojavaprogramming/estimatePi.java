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
public class estimatePi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter number : ");
        int number = scn.nextInt();
        double k = 0 ;
        for(int i = 1 ; i <= number ; i++){
            k+=4*(double)(Math.pow(-1, i+1)/(2*i-1));
            System.out.println(k);
        }
        
    }
    
}
