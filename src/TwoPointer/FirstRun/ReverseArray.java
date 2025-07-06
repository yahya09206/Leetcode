package TwoPointer.FirstRun;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(reverse(nums)));
    }

    public static int[] reverse(int[] arr){

//        - initialize start and end pointer
        int l = 0;
        int r = arr.length - 1;
//        - while start < end
        while(l < r){
            //    - init temp var to store value of start pointer arr[start]
            int temp = arr[l];
//                - swap left with right
            arr[l] = arr[r];
//                - swap right with temp
            arr[r] = temp;
//                - move both pointers closer to middle
            l++;
            r--;

        }
            return arr;
    }

}
