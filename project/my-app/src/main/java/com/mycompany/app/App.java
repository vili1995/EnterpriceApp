package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public boolean assess(int score) {
        if (score >= 50 && score <= 100) {
            return true;
        } else {
            return false;
        }
    }

}