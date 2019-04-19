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
public class displayPyramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number: ");
        int input = scn.nextInt();
        
        for(int i = input ; i>=1 ; i--){
            for(int j = 0; j<2*i+1;j++){
                int deger = i-j;
                if(deger == 0 || deger == -1)
                    continue;
                else if(deger<-1)
                    deger = deger*-1;
                
                System.out.print(deger+" ");
                
            }
            System.out.println("");
        }
        
    
        
            
            
        
    }
    
}
