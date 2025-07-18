package TwoPointer.FirstRun;

public class ReverseString {
    public static void main(String[] args) {

        char[] arr = {'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(arr);
    }

    public static void reverseString(char[] s){

        // init left and right pointer
        int l = 0;
        int r = s.length - 1;

        // as long as left is smaller than right pointer
        while(l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
