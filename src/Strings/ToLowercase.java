package Strings;

public class ToLowercase {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "HELLO";
        System.out.println(toLowercase(str1));
        System.out.println(toLowercase(str2));
    }
    public static String toLowercase(String s){

        return s.toLowerCase();
    }
}
