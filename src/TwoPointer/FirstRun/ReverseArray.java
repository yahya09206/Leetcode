package TwoPointer.FirstRun;

import java.sql.SQLOutput;

public class ReverseArray {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(reverse(nums));
    }

    public static void reverse(int[] arr){

        int left = 0;
        int right = arr.length -1 ;

        while(left < right){

            // store value of left pointer into temp variable
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;



        }
    }

}
