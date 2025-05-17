package Arrays;

public class CountOccurrence {
    public static void main(String[] args) {

        int[] nums = {1,2,34,54,67,86,34,4,34};
        int target = 2;
        System.out.println(countOccurrences(nums, target));
    }

    public static int countOccurrences(int[] arr, int target){

        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            int each = arr[i];
            if (each == target){
                count++;
            }
        }
        return count;
    }
}
