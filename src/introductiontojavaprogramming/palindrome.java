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
public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the string: ");
        String word = scn.nextLine();
        
        int low = 0;
        int high = word.length()-1;
        
        boolean isPalindrome = true;
        
        while(low<high){
            if(word.charAt(low) != word.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        
        if(isPalindrome)
            System.out.println("string is palindrome");
        else
            System.out.println("string is not a palindrome");
    }
    
}
