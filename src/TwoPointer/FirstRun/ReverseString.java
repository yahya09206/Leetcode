package TwoPointer.FirstRun;

public class ReverseString {
    public static void main(String[] args) {

        String sentence = "hello";
        String reversedString = reverseString(sentence);
        System.out.println(reversedString);
    }

    public static String reverseString(String str){

        // return str if null or empty
        if (str == null || str.isEmpty()){
            return str;
        }

        // use char[] to keep track of each character in str
        char[] charArray = str.toCharArray();
        //initialize l and r pointer
        int l = 0;
        int r = charArray.length - 1;

        // check l < r
        // temp var to store value of charArray[l]
        // charArray[l] = charArray[r]
        // charArray[r] = temp

        // move pointers

        // return new String(charArray)
        return new String(charArray);
    }
}
