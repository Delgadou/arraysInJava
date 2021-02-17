package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[]  myIntegers = getIntegers(3);

        for(int i = 0; i<myIntegers.length; i++){
            System.out.println("Element " + i + " has the value: " + myIntegers[i]);
        }

        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Type " + number + " numbers");

        int[] values = new int[number];

        for(int i = 0; i<number; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] values){
        int sum = 0;
        for(int i = 0; i<values.length; i++){
            sum += values[i];
        }

        return (double) sum / (double) values.length;
    }
}

















