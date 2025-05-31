package Arrays;

import java.util.Arrays;

public class ReplaceNegativeWithZero {
    public static void main(String[] args) {

        int[] nums = {2,3,43,-1,65,78,4,110,-3,999,20,4300,-10};
        replaceWithZero(nums);
    }

    public static void replaceWithZero(int[] arr){

        for (int i = 0; i <= arr.length - 1; i++){
            if (arr[i] < 0){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
