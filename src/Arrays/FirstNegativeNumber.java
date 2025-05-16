package Arrays;

public class FirstNegativeNumber {
    public static void main(String[] args) {

        int[] nums = {1,3,-1,2,4};
        System.out.println(findFirstNegative(nums));
    }

    public static int findFirstNegative(int[] arr){

        for (int i = 0; i <= arr.length - 1; i++){
            int each = arr[i];
            if (each < 0){
                return each;
            }
        }
        return -1;
    }
}
