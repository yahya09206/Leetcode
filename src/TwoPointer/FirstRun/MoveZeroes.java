package TwoPointer.FirstRun;

public class MoveZeroes {
    public static void main(String[] args) {


    }

    public void moveZeroes(int[] nums){

        // init left pointer
        int l = 0;

        // iterate through array with right pointer
        // this loop will increment right pointer
        for (int r = 0; r < nums.length; r++){
            // if right pointer != 0
            if (nums[r] != 0){
                // store value of right pointer into temp variable
                int temp = nums[r];
                // store value of left pointer into right pointer
                nums[r] = nums[l];
                // store value of temp value into left pointer
                nums[l] = temp;
                // increment left pointer
                l++;
            }
        }

    }
}
