package Arrays;

public class CountDuplicates {
    public static void main(String[] args) {

        int[] nums = {1,2,2,3,4,4,5,5};
        System.out.println(countDuplicates(nums));
    }
    public static int countDuplicates(int[] arr){

        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            for (int j = i + 1; j <= arr.length - 1; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
