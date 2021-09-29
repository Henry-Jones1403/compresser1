package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your letters");
        String uncompressed = input.next();
        for (int i = 0; i < uncompressed.length(); i++) {
            int count = 0;
            while (i < uncompressed.length() - 1 && uncompressed.charAt(i) == uncompressed.charAt(i+1)){
                count++;
                i++;
            }
            System.out.print(uncompressed.charAt(i));
            count++;
            System.out.print(count);
        }
    }
}

