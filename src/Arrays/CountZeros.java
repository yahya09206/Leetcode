package Arrays;

public class CountZeros {
    public static void main(String[] args) {

        int[] nums = {1,2,3,0,4,5,6,0,0,0,0};
        System.out.println(countZeros(nums));
    }

    public static int countZeros(int[] arr){

        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            if (arr[i] == 0){
                count++;
            }
        }
        return count;
    }
}
