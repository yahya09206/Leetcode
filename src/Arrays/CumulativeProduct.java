package Arrays;

public class CumulativeProduct {
    public static void main(String[] args) {

        int[] nums = {3,3,3};
        System.out.println(findProduct(nums));
    }
    public static int findProduct(int[] arr){

        int product = 1;
        for (int i = 0; i <= arr.length - 1; i++){
            product *= arr[i];
        }
        return product;
    }
}
