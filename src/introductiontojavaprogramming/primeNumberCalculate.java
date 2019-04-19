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
public class primeNumberCalculate {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // display 10 per line 
        final int NUMBER_OF_PRIME = 50;  // number of primes to display
        
        int count = 0; // count the number of prime numbers
        int number = 2;  // a number to be tested for primeness
        
        // repeatedly find prime numbers
        while(count < NUMBER_OF_PRIME){
            //assume the number is prime
            boolean isPrime = true; // is the current number prime ?
            
            //test whether number is prime 
            for(int divisor = 2; divisor <= number / 2; divisor++){
                if(number % divisor == 0){ // if true, number is not prime 
                    isPrime = false; // set isPrime to false
                    break; // exit the for loop
                }
            }
            
            // Display the prime number and increase the count 
            if(isPrime){
                count++; // increase the count 
                if(count % NUMBER_OF_PRIMES_PER_LINE == 0){
                    System.out.println(number); // Display the number and advace to the new line 
                }
                else
                    System.out.print(number + " ");     
            }
            number++; // Check if the next number is prime 
        } 
    }
}