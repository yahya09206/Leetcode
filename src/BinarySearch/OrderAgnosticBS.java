package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {2,3,4,5,6,7};
        int[] arr = {7,6,5,4,3,2,1};
        int target = 5;
        System.out.println(orderAgnosticBs(arr, target));
    }

    public static int orderAgnosticBs(int[] arr, int target){

        int low = 0;
        int high = arr.length - 1;

        boolean isAsc = arr[low] < arr[high];

        while(low <= high){
            int mid = low + (high - low) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }
}
