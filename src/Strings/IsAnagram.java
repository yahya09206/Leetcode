package Strings;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {

        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String s, String t){

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);
    }
}
