package Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,4,4,5,6};
        System.out.println(isSorted(nums));
    }

    public static boolean isSorted(int[] arr){

        for (int i = 1; i < arr.length; i++){
            if (arr[i] >= arr[i - 1]){

            } else {
                return false;
            }
        }
        return true;
    }
}
