package Arrays;

public class CumulativeSum {
    public static void main(String[] args) {
        int[] nums = {3,44,565,6676,12,444,56};
        System.out.println(cumulativeSum(nums));
    }

    public static int cumulativeSum(int[] arr){

        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            sum += arr[i];
        }
        return sum;
    }
}
