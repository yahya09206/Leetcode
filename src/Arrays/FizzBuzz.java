package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 *
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 *
 *
 * Example 1:
 *
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 */
public class FizzBuzz {
    public static void main(String[] args) {


    }
    public static List<String> fizzBuz(int n){

        // new array list
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                result.add("FizzBuzz");
            } else if (i % 3 == 0){
                result.add("Fizz");
            } else if (i % 5 == 0){
                result.add("Buzz");
            } else {
                result.add(i+"");
            }
        }
        return result;
    }
}
