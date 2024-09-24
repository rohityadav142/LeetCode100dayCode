public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            while (n % 2 == 0) {
                n = n / 2;
            }
            if(n==1){
                return true;

            }else{
                return false;
            }
            // Simplified return
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Set the value of n directly
        int n = 4; // Change this value to test different numbers

        boolean result = solution.isPowerOfTwo(n);
        System.out.println(result);
    }
}
