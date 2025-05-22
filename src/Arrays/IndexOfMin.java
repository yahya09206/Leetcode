package Arrays;

public class IndexOfMin {

    public static void main(String[] args) {

        int[] nums = {1,2,6,3,-1,4,5};
        System.out.println(indexOfMin(nums));
    }

    public static int indexOfMin(int[] arr){

        int min = 0;
        for (int i = 1; i <= arr.length - 1; i++){
            if (arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }
}
