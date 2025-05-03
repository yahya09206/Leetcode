package BinarySearch;

public class Classic {
    public static void main(String[] args) {


        int[] arr = {2,3,4,5,6,7};
        int target = 5;
        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {

        // establish starting points
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            // find middle point and prevent overflow
            int mid = low + (high - low) / 2;

            if (target < arr[mid]){
                high = mid - 1;
            } else if (target > arr[mid]){
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
