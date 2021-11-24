package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
//good variable names,good project name. try to use more methods ad be more efficient I guess idk.
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
//	ArrayList<Integer> numbers = new ArrayList();
//    numbers.add(0);
//    numbers.add(1);
//    numbers.add(2);
//    numbers.add(3);
//    numbers.add(4);
//    numbers.add(5);
//    numbers.add(6);
//    numbers.add(7);
//    numbers.add(8);
//    numbers.add(9);
        String[] numbers = new String[10];
        System.out.println("Enter a number between 0 and 9.");
        int numberInput = input.nextInt();
        if ((numbers[numberInput].equals("")) {
            System.out.println("Stored a number");
        } else {
            System.out.println("Couldn't store that number");
        }

    }
}
