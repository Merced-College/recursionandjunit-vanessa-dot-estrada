// Vanessa Estrada

public class Recursion{
    public static void main(String[] args){
        // test cases
        System.out.println(count8(8));   // expected output: 1
    }

        public static int count8(int n) {
            // base case if N is 0, ther eare no digits to count
            if (n == 0) {
                return 0;
            }
            // check the rightmost digit
            int rightmostDigit = n % 10;

            // if the right most digit is 8
            if (rightmostDigit == 8) {
                return 1 + count8(n / 10);

            } else {
                // if the rightmost digit is not 8, just procced to the next digit
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
            return 1 + countHi(str.substring(2)); // send tin the string minus the first 2 char

        return countHi(str.substring(1)); // send in the string minus the first char

    }

    // next Problem

    public static int countHi2(String str){
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
            return 1 + countHi(str.substring(2)); // send tin the string minus the first 2 char

        return countHi(str.substring(1)); // send in the string minus the first char

    }



} // end of class
