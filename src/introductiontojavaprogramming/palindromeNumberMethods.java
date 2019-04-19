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
public class palindromeNumberMethods {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number");
        int input = scn.nextInt();
        int gelenReverse = reverse(input);
        System.out.println("reverse of " +input+ " is : " +gelenReverse);
        boolean result = isPalindrome(gelenReverse);
        System.out.println(result);
        
        
    }
    
    public static int reverse(int number){
        String deger = "";
        while(number > 10){
            deger =deger + String.valueOf(number%10);
            number = number/10;
        }
        deger = deger + String.valueOf(number);
        return Integer.parseInt(deger);
        
        
        
    }
    
    public static boolean isPalindrome(int number){
        String a = String.valueOf(number);
        int low = 0;
        int high = a.length()-1;
        
        while(low<high){
            if(a.charAt(low)==a.charAt(high)){
                low++;
                high--;
            }
            else
                return false;
        }
        return true;
        
    }
    
}
