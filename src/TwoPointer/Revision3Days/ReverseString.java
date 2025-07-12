package TwoPointer.Revision3Days;

public class ReverseString {
    public static void main(String[] args) {

    }

    public static void reverseString(char[] str){

        int l = 0;
        int r = str.length - 1;

        while (l < r){

            char temp = str[l];
            l = str[r];
            r = str[temp];
            l++;
            r--;
        }
    }
}
