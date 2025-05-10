package Arrays;

public class Average {
    public static void main(String[] args) {

        int[] nums = {2,2};
        System.out.println(findAverage(nums));
    }

    public static double findAverage(int[] arr){

        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}
