package Arrays;

public class SumAtOdd {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,1};
        System.out.println(sumAtOdd(nums));
    }
    public static int sumAtOdd(int[] arr){

        int sum = 0;
        for (int i = 1; i <= arr.length - 1; i+=1){
            sum += arr[i++];
        }
        return sum;
    }
}
