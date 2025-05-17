package Arrays;

public class SumAtEven {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(sumAtEven(nums));
    }

    public static int sumAtEven(int[] arr){

        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i+=2){
            sum += arr[i];
        }
        return sum;
    }
}
