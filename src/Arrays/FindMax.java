package Arrays;

public class FindMax {
    public static void main(String[] args) {

        int[] nums = {2,3,43,65,78,4,110,999,20,4300};
        System.out.println(findMax(nums));
    }

    public static int findMax(int[] arr){

        int max = arr[0];
        for (int i = 0; i <= arr.length - 1; i++){
            // track index
            int each = arr[i];
            if (each > max){
                max = each;
            }
        }
        return max;
    }
}
