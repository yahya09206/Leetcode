package TwoPointer.FirstRun;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] arr){

        int i = 0;
        for (int j = 1; j <= arr.length -1; j++){
            if (arr[i] != arr[j]){
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}
