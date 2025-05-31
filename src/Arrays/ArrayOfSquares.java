package Arrays;

public class ArrayOfSquares {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        arrayOfSquares(nums);
    }

    public static void arrayOfSquares(int[] arr){

        int[] squares = new int[arr.length];
        for (int i = 1; i < arr.length; i++){
            squares[i] = (i + 1) * (i + 1);
        }
        for(int square : squares){
            System.out.print(square + " ");
        }
    }
}
