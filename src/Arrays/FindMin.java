package Arrays;

public class FindMin {
    public static void main(String[] args) {

        int[] nums = {2, -1, 54, 18, -44, 30, 130, -100};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] arr){

        int min = arr[0];
        for (int i = 0; i <= arr.length - 1; i++){
            int each = arr[i];
            if (each < min){
                min = each;
            }
        }
        return min;
    }
}
