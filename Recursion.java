// Vanessa Estrada
//10.24.24
//Recursive Problems Testing with Junit

public class Recursion{
    //Run|Debug
    public static void main(String[] args) {
        // Test Cases
        System.out.println(count8(8));      //expected output: 1
        System.out.println(count8(818));    //expected output: 2
        System.out.println(count8(8818));   //expected output: 3
        System.out.println(count8(123456)); //expected output: 0
        System.out.println(count8(88888));  //expected output: 9
        System.out.println(count8(80808));  //expected output: 2

    }

        public static int count8(int n) {
            // base case if N is 0, ther eare no digits to count
            if (n == 0) {
                return 0;
            }
            //check Right most digit
            int rightmostDigit = n % 10;

            // if the right most digit is 8
            if (rightmostDigit == 8) {
                return 1 + count8(n / 10);

            } else {
                // if the rightmost digit is not 8, just proceed to the next digit
                return count8(n / 10);
            } // End else
        
    } // end of method

    // next Problem

    public static int countHi(String str){
        // check for null
        if (str == null)
            return 0;


        // base case
        if (str.length() < 2)
            return 0;


        char char1 = str.charAt(0);
        char char2 = str.charAt( 1);

        //check if char1 and h  char2 is an i
        if(char1 == 'h' && char2 == 'i')
            return 1 + countHi(str.substring(2)); // send in the string minus the first 2 char

        return countHi(str.substring(1)); // send in the string minus the first char

    }

    // next Problem

    public static int countHi2(String str){

        // base case
        if (str.length() < 2)
            return 0;


        char char1 = str.charAt(0);
        char char2 = str.charAt( 1);

        //check if substring starts with "hi"
        if(str.startsWith("hi")){
            if (str.length() < 3|| str.charAt(0) != 'x'){
                return 1 + countHi2(str.substring(2)); // move past "hi"

            }else {
                return countHi2(str.substring(2)); // Just move past "hi"
            }
        }else {
            return countHi2(str.substring(2)); // Just move past "hi"
        }

       
    } // end

    public static int strCount(String str, String sub) {
        // Base case: if the string is shorter than the substring, return 0
        if (str.length() < sub.length()) {
            return 0;
    }

        // Check if the string starts with the substring
        if (str.startsWith(sub)) {
            // If it does, count 1 and recursively call the function on the remaining string
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            // Otherwise, continue with the next substring (skip the first character)
            return strCount(str.substring(1), sub);
        }
    }


} // end of class
