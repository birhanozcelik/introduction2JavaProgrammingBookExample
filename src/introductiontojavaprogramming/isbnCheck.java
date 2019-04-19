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
 * isbn numarası hesaplama döngüsüz
 */
public class isbnCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("ISBN numarasının 1. hanesini giriniz: ");
        int first = scn.nextInt();
        System.out.println("ISBN numarasının 2. hanesini giriniz: ");
        int second = scn.nextInt();
        System.out.println("ISBN numarasının 3. hanesini giriniz: ");
        int third = scn.nextInt();
        System.out.println("ISBN numarasının 4. hanesini giriniz: ");
        int fourth = scn.nextInt();
        System.out.println("ISBN numarasının 5. hanesini giriniz: ");
        int fifth = scn.nextInt();
        System.out.println("ISBN numarasının 6. hanesini giriniz: ");
        int sixth = scn.nextInt();
        System.out.println("ISBN numarasının 7. hanesini giriniz: ");
        int seventh = scn.nextInt();
        System.out.println("ISBN numarasının 8. hanesini giriniz: ");
        int eight = scn.nextInt();
        System.out.println("ISBN numarasının 9. hanesini giriniz: ");
        int nineth = scn.nextInt();
        
        int isbn = (first*1+second*2+third*3+fourth*4+fifth*5+sixth*6+seventh*7+eight*8+nineth*9)%11;
        System.out.println(first+""+second+""+third+""+fourth+""+fifth+""+sixth+""+seventh+""+eight+""+nineth+""+isbn);
        
        
        
        
    }
    
}
