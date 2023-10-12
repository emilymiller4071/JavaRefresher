package org.example;

public class FirstLastSix {
    public static void main(String[] args) {

        int[] test1 = {1, 2, 6};
        boolean result1 = firstLast6(test1);
        System.out.println("Test1 = " + result1);

        int[] test2 = {6, 1, 2, 3};
        boolean result2 = firstLast6(test2);
        System.out.println("Test1 = " + result2);

        int[] test3 = {13, 6, 1, 2, 3};
        boolean result3 = firstLast6(test3);
        System.out.println("Test1 = " + result3);

    }

    public static boolean firstLast6(int[] nums) {
            if (nums[0] == 6 || nums[nums.length - 1] == 6) {
                return true;
            }
        return false;
    }

}