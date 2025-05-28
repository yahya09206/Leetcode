package Arrays;

public class PositiveGreaterThanAvg {
    public static void main(String[] args) {

        int[] nums = {13,4,45,6};
        System.out.println(numsGreaterThanAvg(nums));
    }

    public static int numsGreaterThanAvg(int[] arr){

        int count = 0;
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        return count;
    }
}
