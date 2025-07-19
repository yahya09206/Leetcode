package Strings;

public class isPalindrome {
    public static void main(String[] args) {

        String str = "levels";
        System.out.println(isAPalindrome(str));
    }

    public static boolean isAPalindrome(String s){

        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--){
            reversed += s.charAt(i);
        }
        if (!reversed.equals(s)){
            return false;
        }
        return true;
    }
}
