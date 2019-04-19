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
public class annualSave {
    public static void main(String[] args) {
        double annualInterestRate =0.0375;
        double monthlyRate = 1+(0.0375/12);
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter your monthly saving amounth: ");
        int savingAmounth = scn.nextInt();
        double totalAmounth =  savingAmounth * monthlyRate;
        System.out.println("after the  1.month, the account value is : " +totalAmounth);
        for(int i = 0 ; i<5 ; i++){
            totalAmounth = (savingAmounth+totalAmounth) * monthlyRate;
            System.out.println("after the " +(i+2) +"," + "the account value is : " +totalAmounth);
        }
        System.out.println("your account value after the sixth month: " +totalAmounth);
    }
    
}
