// Actual arrays are not a dinamic data structure. 
// That means once you created an array instance you cannot change its size. They are static.
// In Java, if you want a dinamically sized array, you should use the ArrayList class.


// Here are examples of operations of insertion (O(1)) and deletion (O(n)) of items in a static array.

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int[] newArray = removeFromArrayByIndex2(intArray, 4);

        System.out.println(Arrays.toString(newArray));
    }

    // O(n) time complexity
    public static int[] removeFromArrayByIndex(int[] array, int index) {
        if (index > (array.length - 1) || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        int[] newArray = new int[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }

        return newArray;
    }

    // O(n) time complexity
    public static int[] removeFromArrayByIndex2(int[] array, int index) {
        if (index > (array.length - 1) || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        int[] newArray = new int[array.length - 1];
        int[] firstHalf = Arrays.copyOfRange(array, 0, index);
        int[] secondHalf = Arrays.copyOfRange(array, index + 1, array.length);

        System.arraycopy(firstHalf, 0, newArray, 0, firstHalf.length);
        System.arraycopy(secondHalf, 0, newArray, firstHalf.length, secondHalf.length);

        return newArray;
    }
}
