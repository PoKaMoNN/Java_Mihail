package HomeWork3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        // Task 1: Reverse an array

        int[] array = {1, 2, 3, 4, 5};

        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            reversedArray[i] = array[array.length - 1 - i];

        }

        System.out.println("Initial array: " + Arrays.toString(array));

        System.out.println("Reversed array: " + Arrays.toString(reversedArray));



        // Task 2: Remove the middle element from an array

        int[] array2 = {1, 2, 3, 4, 5, 6};

        int middleIndex = array2.length / 2;

        int[] newArray = new int[array2.length - 1];

        for (int i = 0, j = 0; i < array2.length; i++) {

            if (i != middleIndex) {

                newArray[j++] = array2[i];

            }

        }

        System.out.println("Array without middle element: " + Arrays.toString(newArray));

    }

    }

