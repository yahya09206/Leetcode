package Arrays;

public class CheckIfTargetExists {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};
        int target = 5;
        System.out.println(checkIfTarget(nums, target));
    }

    public static int checkIfTarget(int[] arr, int target){

        for (int i = 0;i <= arr.length - 1; i++){
//            int each = arr[i];
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
