package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sizeArray;

        System.out.print("Type the size of your array: ");
        sizeArray = scanner.nextInt();

        int[] array = getIntegers(sizeArray);
        System.out.println("Array without ordering");
        printArray(array);

        int[] sorted = descendingOrder(array);
        System.out.println("Array with ordering");
        printArray(sorted);

        System.out.println("The average is " + getAverage(array));

        System.out.println("The minimum value of the array is: " + findMin(array));
        System.out.println("The maximum value of the array is: " + findMax(array));
    }

    public static void printArray(int[] myArray){
        System.out.println(Arrays.toString(myArray));
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

    public static int findMin(int[] array){
        int minimumValue = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            if(minimumValue > array[i]){
                minimumValue = array[i];
            }
        }

        return minimumValue;
    }

    public static int findMax(int[] array){
        int maximumValue = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(maximumValue < array[i]){
                maximumValue = array[i];
            }
        }

        return maximumValue;
    }
}

















