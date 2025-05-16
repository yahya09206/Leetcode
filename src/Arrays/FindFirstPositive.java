package Arrays;

public class FindFirstPositive {
    public static void main(String[] args) {

        int[] nums = {-1,-3,2,4};
        System.out.println("First positive number is " + findFirstPositive(nums));
    }
    public static int findFirstPositive(int[] arr){

        for (int i = 0; i <= arr.length - 1; i++){
            int each = arr[i];
            if (each >= 0){
                return each;
            }
        }
        return -1;
    }
}
