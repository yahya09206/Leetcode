package TwoPointer.FirstRun;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] arr){


        // Set left to 0
        int l = 0;
        // Loop thru array with r pointer
        for(int r = 1; r < arr.length; r++){
            // Check if current index nums[r] != nums[r-1]
            // arr[r] = l
            // nums[k++] = nums[r]
            // return l
        }

        return l;
    }
}
