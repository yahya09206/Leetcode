package Arrays;

public class CountOddNumbers {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,7,77,9};
        System.out.println(countEven(nums));
    }

    public static int countEven(int[] arr){

        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            int each = arr[i];
            if (each % 2 != 0){
                count++;
            }
        }
        return count;
    }
}
