package Strings;

public class CountConsonants {
    public static void main(String[] args) {

        String str = "hellooo";
        System.out.println(countConsonants(str));
    }

    public static int countConsonants(String str){

        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++){
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'
                    && str.charAt(i) != 'o' && str.charAt(i) != 'u' ){
                count++;
            }
        }
        return count;
    }
}
