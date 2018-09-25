package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        int randomnum = (int)(10.0*Math.random());
        Scanner input = new Scanner(System.in);
        System.out.println("Guess my number.");
        String usernum = input.nextLine();
        input.close();;
        
    }
}
