package com.company;

public class MyArrayList {

    public int[] printMyArray(int[] intArray) {

        for (int number = 0; number < intArray.length; number++) {
            System.out.print(intArray[number] + " ");    // prints array in one line
        }
        return intArray;
    }   // intArray method END

    public double[] printMyArray(double[] doubleArray) {

        for (int decimal = 0; decimal < doubleArray.length;
             decimal++) {
            System.out.print(doubleArray[decimal] + " ");
        }
        return doubleArray;
    }   // doubleArray method END

    public char[] printMyArray(char[] characterArray) {

        for (int character = 0; character < characterArray.length;
             character++) {
            System.out.print(characterArray[character] + " ");
        }
        return characterArray;
    }   // characterArray method END
}
