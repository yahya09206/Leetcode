package TwoPointer.FirstRun;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] arr){

        // Set left to 0
        int l = 0;
        // Loop through array with r pointer
        for(int r = 1; r <= arr.length - 1; r++){
            // Check if current index arr[l+1] != arr[r]
            if (arr[l] != arr[r]){
                // Assign r pointer to next l pointer
                arr[l+1] = arr[r];
                // Increment l pointer
                l++;
            }
        }
        // Return l + 1
        return l + 1;
    }
}
