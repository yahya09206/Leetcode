package Strings;

public class RemoveDigits {
    public static void main(String[] args) {

        String str = "453hell433o";
        System.out.println(removeDigits(str));
    }

    public static String removeDigits(String s){

        String replaced = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            replaced = s.replaceAll("\\d", "");
        }
        return replaced;
    }
}
