package TwoPointer.Revised3Days;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverseArray(arr)));

    }

    public static int[] reverseArray(int[] nums){

        int start = 0;
        int end = nums.length - 1;

        while (start < end){

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = nums[temp];
            start++;
            end--;
        }
        return nums;
    }
}
