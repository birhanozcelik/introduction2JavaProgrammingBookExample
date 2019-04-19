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
public class chapter6and6dot13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number : ");
        int number = scn.nextInt();
        sumSeries(number);
        
    }
    
    public static void sumSeries(int number){
        
        double k = 0;
      for(double i = 1; i <=number ; i++){
           k +=(i/(i+2));
          System.out.println(k);
      }
    }
}
