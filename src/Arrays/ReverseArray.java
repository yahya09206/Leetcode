package Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        reverseArray(nums);

    }

    public static void reverseArray(int[] arr){

        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
