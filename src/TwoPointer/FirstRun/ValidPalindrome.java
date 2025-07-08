package TwoPointer.FirstRun;

public class ValidPalindrome {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(String s){

//        -  return true if string is empty or null
        if (s == null || s.isEmpty()){
            return true;
        }
        //- init start and end pointers
        int start = 0;
        int end = s.length() - 1;
        while(start <= end){

            //- 2 vars to keep track of char index
            char currFirst = s.charAt(start);
            char currEnd = s.charAt(end);
            //- increment start if character is a letter or digit
            if (Character.isLetterOrDigit(currFirst)){
                start++;
            }
            //- decrement end if !Character.isLetterOrDigit(currEnd)
            else if (!Character.isLetterOrDigit(currEnd)){
                end--;
            }
            else {
                //- return false if Character.toLowerCase(currFirst) != Character.toLowerCase(currEnd)
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currEnd)){
                    return false;
                }
                //- increase start and decrement end
                start++;
                end--;
            }
        }

        //- return true if above = true
        return true;
    }
}
