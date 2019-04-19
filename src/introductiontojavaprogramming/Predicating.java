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
public class Predicating {
    public static void main(String[] args) {
        double harc = (double)10000;
        int yil = 1;
        
        while(harc < 20000){
            harc *= 1.07;
            yil++;
        }
        System.out.printf("%d yil sonra harc %f olur ",yil,harc);
    
}
}