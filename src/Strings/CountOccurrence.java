package Strings;

public class CountOccurrence {
    public static void main(String[] args) {

        String str = "ccccharizardc";
        System.out.println(count(str, 'h'));
    }

    public static int count(String s, char c){

        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++){
            if (s.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
}
