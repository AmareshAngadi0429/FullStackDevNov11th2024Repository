package com.gentech.recursion;
class Primee
{
    static boolean isprime(int n, int y) {
        if (y == 1){
            return true;
        }
        if(n%y==0) {
            return false;
        }

        return  isprime(n,y-1);

    }
}
public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println(Primee.isprime(7,6));
    }
}
