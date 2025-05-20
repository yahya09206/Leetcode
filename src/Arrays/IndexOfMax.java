package Arrays;

public class IndexOfMax {
    public static void main(String[] args) {

        int[] nums = {1,2,6,3,4,5};
        System.out.println(indexOfMax(nums));
    }

    public static int indexOfMax(int[] arr){

        int max = 0;
        for (int i = 1; i <= arr.length - 1; i++){
            if (arr[i] > arr[max]){
                 max = i;
            }
        }
        return max;
    }
}
