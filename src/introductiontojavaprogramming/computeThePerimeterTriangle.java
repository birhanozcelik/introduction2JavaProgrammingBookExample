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
public class computeThePerimeterTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the first edge: ");
        int firstEdge = scn.nextInt();
        System.out.println("enter the second edge: ");
        int secondEdge = scn.nextInt();
        System.out.println("enter the third edge: ");
        int thirdEdge = scn.nextInt();
        int perimeter;
        if(firstEdge<(secondEdge+thirdEdge) && secondEdge<(firstEdge+thirdEdge) && thirdEdge<(firstEdge+secondEdge)){
            perimeter = (firstEdge+secondEdge+thirdEdge);
            System.out.println(perimeter);
        }
        else
            System.out.println("please enter value again...");
    }
    
}
