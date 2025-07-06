package TwoPointer.FirstRun;

public class ReverseString2 {
    public static void main(String[] args) {

        String sentence = "";
        String reversedString = reverseString(sentence);
        System.out.println(reversedString);
    }

    public static String reverseString(String str){

        /**
         * Strings in Java are immutable, meaning their contents cannot be changed directly.
         * To modify the characters, the string must first be converted into a mutable char array.
         */

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
        while(l < r){

            // temp var to store value of charArray[l]
            char temp = charArray[l];
            // charArray[l] = charArray[r]
            charArray[l] = charArray[r];
            // charArray[r] = temp
            charArray[r] = temp;

            // move pointers
            l++;
            r--;

        }

        // return new String(charArray)
        return new String(charArray);
    }
}
