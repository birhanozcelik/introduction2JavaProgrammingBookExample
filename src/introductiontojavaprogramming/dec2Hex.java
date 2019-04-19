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
public class dec2Hex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("decimal gir ");
        int dec = scn.nextInt();
        System.out.println(hexBul(dec));
        /*
        String hex = "";
        
        while(dec != 0){
            int hexDeger = dec % 16;
            
            char hexDigit = (hexDeger <= 9 && hexDeger >= 0)? (char)(hexDeger + '0'):(char)(hexDeger - 10 + 'A');           
            hex = hexDigit + hex;
            dec = dec /16;
        }
        System.out.println(hex);
        */
        
    }
    
    public static String hexBul(int dec){
        String hex = "";
        while(dec != 0){
            int hexDeger = dec % 16;
            char hexDigit = (hexDeger <= 9 && hexDeger >= 0)? (char)(hexDeger + '0'):(char)(hexDeger - 10 + 'A');           
            hex = hexDigit + hex;
            dec = dec /16;
        }
        return hex;
        
    }
    
}
