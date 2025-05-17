package Arrays;

public class AllPositive {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        System.out.println(checkPositives(nums));
    }

    public static boolean checkPositives(int[] arr){

        for (int i = 0; i <= arr.length - 1; i++) {
            int each = arr[i];
            if (each <=  0) {
                return false;
            }
        }
        return true;
    }
}
