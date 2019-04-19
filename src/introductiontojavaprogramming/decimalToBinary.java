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
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the decimal number: ");
        int decimal = scn.nextInt();
        
        String binary = "";
        
        while(decimal != 0){
            int binaryValue = decimal % 2;
            binary = String.valueOf(binaryValue)+binary;
            decimal = decimal/2;
        }
        System.out.println(binary);
    }
    
}
