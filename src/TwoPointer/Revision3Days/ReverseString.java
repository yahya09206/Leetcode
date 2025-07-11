package TwoPointer.Revision3Days;

public class ReverseString {
    public static void main(String[] args) {

        String str = "remove";
        System.out.println(reverseString(str));
    }

    public static void reverseString(char[] str){

        int l = 0;
        int r = 0;

        while (l < r){

            char temp = str[l];
            l = str[r];
            r = str[temp];
            l++;
            r--;
        }
    }
}
