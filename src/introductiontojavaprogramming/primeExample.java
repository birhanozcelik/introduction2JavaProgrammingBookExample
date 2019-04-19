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
public class primeExample {

    public static void main(String[] args) {
        final int ASAL_SAYİ_ADEDİ = 50;
        final int BASAMAK_SAYİSİ = 10;
        
        int adet = 0;
        int sayi = 2;
        while (adet < ASAL_SAYİ_ADEDİ) {
            boolean asalMi = true;
            for (int bolen = 2; bolen <= sayi / 2; bolen++) {
                if (sayi % bolen == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                adet++;
                if (adet % BASAMAK_SAYİSİ == 0) {
                    System.out.println(sayi);
                } else {
                    System.out.print(sayi + " ");
                }
            }
            sayi++;
        }
    }

}
