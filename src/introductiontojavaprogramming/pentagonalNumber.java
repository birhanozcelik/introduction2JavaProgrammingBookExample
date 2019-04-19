/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontojavaprogramming;

/**
 *
 * @author pc
 */
public class pentagonalNumber {
    public static void main(String[] args) {
        for(int i = 1 ; i < 20 ; i++){
            System.out.println(getPentagonalNumber(i));
        } 
    }
    
    public static int getPentagonalNumber(int n){
        int result = n*(3*n-1)/2;
        return result;
    }
    
}
