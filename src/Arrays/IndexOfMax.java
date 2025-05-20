package Arrays;

public class IndexOfMax {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        System.out.println(indexOfMax(nums));
    }

    public static int indexOfMax(int[] arr){

        int max = 0;
        for (int i = 1; i <= arr.length - 1; i++){
            int each = arr[i];
            if (each > max){
                 max = i;
            }
        }
        return max;
    }
}
