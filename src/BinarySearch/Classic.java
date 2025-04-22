package BinarySearch;

public class Classic {
    public static void main(String[] args) {


        int[] arr = {2,3,4,5,6,7};
        int target = 5;
        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int mid = low + (high - low ) / 2;

            if(arr[mid] > target){
                high = mid - 1;
            } else if(arr[mid] < target){
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
