package Arrays;

public class CountEvenNumbers {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,1,2,3,4,5,6};
        System.out.println(countEvenNumbers(nums));
    }

    public static int countEvenNumbers(int[] arr){

        int even = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            int each = arr[i];
            if (each % 2 == 0){
                even++;
            }
        }
        return even;
    }
}
