// Vanessa Estrada

public class Recursion{
    public static void main(String[] args){
        // test cases
        System.out.println(count8(n:8));   // expected output: 1

        public static int count8(int n) {
            // base case if N is 0, ther eare no digits to count
            if (n == 0) {
                return 0;
            }
            // check the rightmost digit
            int rightmostDigit = n % 10;

            // check the next digit to the left
            int nextDigit = (n / 10) % 10;

            // if the right most digit is 8
            if (rightmostDigit == 8) {
                return 1 + count8(n / 10);

            } else {
                // if the rightmost digit is not 8, just procced to the next digit
                return count8(n / 10);
            } // End else
        
    } // end of method

} // end of class