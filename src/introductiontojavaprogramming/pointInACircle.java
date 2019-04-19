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
public class pointInACircle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("first coordinate: ");
        int first = scn.nextInt();
        System.out.println("second coordinate: ");
        int second = scn.nextInt();
        
        double hipotenus = Math.pow(first, 2) + Math.pow(second, 2);
        hipotenus = Math.pow(hipotenus, 0.5);
        
        if(hipotenus<=10){
            System.out.println("point " +first+ " and " +second+ " is in the circle");
        }
        else
            System.out.println("point " +first+ " and " +second+ " is not in the circle");
            
    }
    
}
