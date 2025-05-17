package Arrays;

public class CheckDuplicates {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        System.out.println(checkDuplicates(nums));
    }

    public static boolean checkDuplicates(int[] arr){

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
