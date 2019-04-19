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
public class hex2DecMethod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the hex: ");
        String hex = scn.nextLine();
        
        System.out.println("the decimal value for the hex number " + hex + " is " +hexToDecimal(hex.toUpperCase()));
    }
    
    public static int hexToDecimal(String hex){
        int decimalValue = 0;
        
        for(int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    
    public static int hexCharToDecimal(char ch){
        
        if(ch>='A' && ch<='F'){
            return 10 + ch -'A';
            
        }
        else
            return ch - '0';
        
    }
    
}
