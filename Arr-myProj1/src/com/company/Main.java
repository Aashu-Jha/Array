package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        sortIntegers(myIntegers);
        printArray(myIntegers);

    }
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " nubers in array");
        int[] values = new int[number];

        for(int i =0;i<number;i++){
            values[i] = scan.nextInt();
        }
        return values;
    }

    public  static int[] printArray(int[] array){
        for(int i=0; i < array.length;i++){
            System.out.println("Element is " +array[i]);
        }
        return array;
    }

    public static int[] sortIntegers(int[] array){
        int temp;
        boolean flag=true;
        while (flag) {
            flag = false;
            for(int i = 0; i < array.length-1; i++){
                if(array[i ] < array[i+1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i +1 ] = temp;
                    flag = true;
                }
            }
        }
        System.out.println("Array Sorted!!");
        return array;
    }
}
