package TwoPointer.FirstRun;

public class RemoveElement {
    public static void main(String[] args) {

    }
    public int removeElement(int[] nums, int val){

        //initialize left pointer
        int l = 0;

        //loop through with right pointer
        for (int r = 0; r <= nums.length - 1; r++){
            // check if nums[r] != val
            if (nums[r] != val){
                // switch value at nums[l] with value at current index nums[r]
                nums[l] = nums[r];
                // increment left pointer
                l++;
            }
        }

        // return left pointer
        return l;
    }
}
