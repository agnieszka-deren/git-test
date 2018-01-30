package com.agaderen.silnia;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        int result;
        result = silnia(n);
        System.out.println("Silnia " + n + "wynosi " + result);
    }

    public static int silnia(int n){
        if (n>2) {
          return   n * silnia(n - 1);
        }
        else {
            return n;
        }
    }

}
