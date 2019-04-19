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
public class standardDeviationAndMean {
    public static void main(String[] args) {
        double d1 = 1;
        double d2 = 2;
        double d3 = 3;
        double d4 = 4.5;
        double d5 = 5.6;
        double d6 = 6;
        double d7 = 7;
        double d8 = 8;
        double d9 = 9;
        double d10 =10;
        
        int n = 10;
        double totally = d1+d2+d3+d4+d5+d6+d7+d8+d9+d10;
        double mean = totally/n;
        
        double deviation;
        double squareOfSum = (Math.pow(totally, 2))/n;
        
        double squareSum = d1*d1+d2*d2+d3*d3+d4*d4+d5*d5+d6*d6+d7*d7+d8*d8+d9*d9+d10*d10;
        
        deviation = (squareSum-squareOfSum)/(n-1);
        deviation = Math.pow(deviation, 0.5);
        System.out.println("mean is : " +mean);
        System.out.println("deviation is : " +deviation);
        
        
        
        
        
        
    }
    
}
