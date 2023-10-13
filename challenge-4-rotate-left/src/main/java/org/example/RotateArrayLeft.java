package org.example;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] result1 = rotateLeft3(array1);
        System.out.println(Arrays.toString(result1));

        int[] array2 = {5, 11, 9};
        int[] result2 = rotateLeft3(array2);
        System.out.println(Arrays.toString(result2));

        int[] array3 = {7, 0, 0};
        int[] result3 = rotateLeft3(array3);
        System.out.println(Arrays.toString(result3));
    }

    public static int[] rotateLeft3(int[] nums) {
        int[] newArray = new int[3];

        for(int i = 0; i < nums.length; i++) {
            newArray[0] = nums[1];
            newArray[1] = nums[2];
            newArray[2] = nums[0];
        }
        return newArray;
    }
}