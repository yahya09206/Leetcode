package Arrays;

public class StrictlyIncreasing {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int[] nums2 = {1,2,2,3,4,5};

        System.out.println(strictlyIncreasing(nums));
        System.out.println(strictlyIncreasing(nums2));
    }

    public static boolean strictlyIncreasing(int[] arr){

        for (int i = 1; i < arr.length; i++){
            if (arr[i] <= arr[i - 1]){
                return false;
            }
        }
        return true;
    }
}
