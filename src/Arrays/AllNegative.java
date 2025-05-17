package Arrays;

public class AllNegative {
    public static void main(String[] args) {

        int[] nums = {-1,-2,-3,-4,-5};
        System.out.println(checkNegative(nums));
    }

    public static boolean checkNegative(int[] arr){

        for (int i = 0; i <= arr.length - 1; i++){
            int each = arr[i];
            if (each >= 0){
                return false;
            }
        }
        return true;
    }
}
