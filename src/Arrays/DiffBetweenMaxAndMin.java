package Arrays;

public class DiffBetweenMaxAndMin {
    public static void main(String[] args) {

        int[] nums = {2,3,43,65,1,78,4,5000,110,999,4300};
        System.out.println(findDifference(nums));
    }

    public static int findDifference(int[] arr) {

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            // track index
            int each = arr[i];
            if (each > max) {
                max = each;
            }
            if (each < min){
                min = each;
            }
        }
        return max - min;
    }
}
