package Strings;

public class ReverseString {
    public static void main(String[] args) {

        String str = "wired";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String s){

        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--){
            reversed += s.charAt(i);
        }
        return reversed;
    }
}
