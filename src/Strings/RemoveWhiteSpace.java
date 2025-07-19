package Strings;

public class RemoveWhiteSpace {
    public static void main(String[] args) {

        String str = " H e ll u rrrr ";
        System.out.println(removeWhiteSpace(str));
    }
    public static String removeWhiteSpace(String s){
        return s.replaceAll("\\s", "");
    }
}
