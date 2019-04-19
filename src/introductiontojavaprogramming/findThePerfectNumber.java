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
public class findThePerfectNumber {
    public static void main(String[] args) {
        
        for(int i = 10000; i > 1; i--){
            int toplam=0;
             for(int j = 1; j < i; j++){
                 
                 if(i % j == 0){
                   toplam+=j;  
                 }
             }
             if(toplam == i){
                 System.out.println(i);
             }
            
                 
            
        }
        
    }
}
