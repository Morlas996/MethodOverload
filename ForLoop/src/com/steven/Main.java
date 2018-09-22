package com.steven;

public class Main {

    public static void main(String[] args) {
        int primeIncrement = 0;
        for(int i = 2; i < 9; i++){
            double rate = (double)(i);
            System.out.println("Loop " + i);
            System.out.println( "10,000 at " + i + " % interest = " + String.format("%.2f",calculateInterest(10000, rate)));
        }
        System.out.println("*************************************************************");
        for(int i = 8; i  > 1; i--){
            double rate = (double)(i);
            System.out.println("Loop " + i);
            System.out.println( "10,000 at " + i + " % interest = " + String.format("%.2f",calculateInterest(10000, rate)));
        }
        for(int i = 500; i < 800; i++){


            if(isPrime(i) == true){
                System.out.println("Number " + i + " is a prime number");
                primeIncrement++;
                if(primeIncrement == 15){
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i=2; i <= (long) Math.sqrt(n); i++){
          //  System.out.println("looping " + i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate / 100);
    }
}
