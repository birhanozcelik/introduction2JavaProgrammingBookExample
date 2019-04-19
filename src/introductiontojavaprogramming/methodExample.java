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

public class methodExample {
    public static void islemYap(int x , int y){
        int toplam,carpim,cikarma;
        double bolum;
        toplam = x+y;
        carpim = x*y;
        bolum = (double)x/y;
        cikarma = x-y;
        System.out.println("toplam: " +toplam+ " cikarma: " +cikarma+ " bolum: " +bolum+ " carpim: " +carpim);
    }
    
    
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        System.out.println("1. degeri giriniz: ");
        int deger1 = scn.nextInt();
        System.out.println("2. degeri giriniz: ");
        int deger2 = scn.nextInt();
        islemYap(deger1, deger2);
    }
}
