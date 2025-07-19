package Strings;

public class RemoveVowels {
    public static void main(String[] args) {

        String str = "hello";
        System.out.println(removeVowels(str));
    }
    public static String removeVowels(String str){

        String replaced = "";
        for (int i = 0; i <= str.length() - 1; i++) {
                replaced = str.replaceAll("[aeiou]", "");
            }
        return replaced;
    }
}
