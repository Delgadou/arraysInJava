package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sizeOfArray;

        System.out.print("Type the size of your array: ");
        sizeOfArray = scanner.nextInt();

        int[]  myIntegers = getIntegers(sizeOfArray);
        System.out.println("Array without ordering");
        printArray(myIntegers);

        int[] sorted = descendingOrder(myIntegers);
        System.out.println("Array with ordering");
        printArray(sorted);

        //System.out.println("The average is " + getAverage(myIntegers));
    }

    public static void printArray(int[] myArray){
        for(int i = 0; i<myArray.length; i++){
            System.out.println("[" + i + "]" + ": " + myArray[i]);
        }
    }

    public static int[] getIntegers(int number){
        System.out.print("Type " + number + " numbers: ");
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

    public static int[] descendingOrder(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        int temp;
        for (int j = 0; j < sortedArray.length; j++) {
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i + 1];
                    sortedArray[i + 1] = sortedArray[i];
                    sortedArray[i] = temp;
                }
            }
        }
        return sortedArray;
    }
}

















