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
public class checkPassword {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the password: ");
        String pass = scn.nextLine();
        checkPassword(pass);
        
    }
    
    public static void checkPassword(String pass){
        int numberOfDigits=0;
        int numberOfLetter = 0;
        if(pass.length()<10){
            System.out.println("please enter the least 10 characters");
        }
        else{
            for(int i = 0 ; i<pass.length() ; i++){
                if(pass.charAt(i)>= 48 && pass.charAt(i)<=57){
                    numberOfDigits++;
                }
                else if ((pass.charAt(i)>=65 && pass.charAt(i)<=90)||(pass.charAt(i)>= 97 && pass.charAt(i)<=122)){
                    numberOfLetter++;
                }
                else
                    System.out.println("a password consist of only letters and digits.."); 
            }
            if(numberOfDigits<3){
                System.out.println("a password must contain at least three digits...");
            }
            else
                System.out.println("valid password....");
        }
    }
    
}
