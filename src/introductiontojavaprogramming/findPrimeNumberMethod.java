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
public class findPrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("the first 50 prime numbers are \n");
        printPrimeNumber(50);
    }
    
    public static void printPrimeNumber(int numberOfPrime){
        final int NUMBER_OF_PRİMES_PER_LINE = 10;
        
        int count = 0;
        int number = 2;
        
        while(count < numberOfPrime){
            
            if(isPrime(number)){
                count++;
                if(count % NUMBER_OF_PRİMES_PER_LINE == 0){
                    System.out.printf("%-5s\n",number);
                }
                else
                    System.out.printf("%-5s",number);
            }
            number++;
        }
    }
    
    public static boolean isPrime(int number){
        for(int divisor = 2; divisor <= number / 2; divisor++){
            if(number % divisor == 0){
                return false;
            }
        }
        return true;
    }
    
}
