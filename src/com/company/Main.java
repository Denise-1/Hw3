// Denise Chen
// IS 147-04
// d189@umbc.edu
// 11/10/2021
// Use overload methods to print out different arrays

package com.company;

public class Main {

    static int[] intArray = {1, 2, 3, 4, 5, 6};
    static double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
    static char[] characterArray = {'H', 'E', 'L', 'L', 'O'};

    public static void main(String[] args) {

        System.out.println("Array integerArray contains: ");
        MyArrayList intArray2 = new MyArrayList();
        intArray2.printMyArray(intArray);
        System.out.println("\n");

        System.out.println("Array doubleArray contains: ");
        MyArrayList doubArray = new MyArrayList();
        doubArray.printMyArray(doubleArray);
        System.out.println("\n");

        System.out.println("Array characterArray contains: ");
        MyArrayList charArray = new MyArrayList();
        charArray.printMyArray(characterArray);
        System.out.print("\n");
    }
}

