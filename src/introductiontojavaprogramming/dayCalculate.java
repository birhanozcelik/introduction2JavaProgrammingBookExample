/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontojavaprogramming;

import static java.lang.System.currentTimeMillis;

/**
 *
 * @author pc
 */
public class dayCalculate {
    public static void main(String[] args) {
        // if today is tuesday, what will be the day in 100 days?
        System.out.println(currentTimeMillis());
        System.out.println(currentTimeMillis()%10);
    }
    
}
