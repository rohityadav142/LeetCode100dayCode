public class PalindromeDay1 {

    public static void main(String[] args) {
        int x = 121; // Example number to check
        boolean result = isPalindrome(x);
        System.out.println(x + " is palindrome: " + result);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int revnum = 0;
        while (n > 0) {
            int d = n % 10;
            revnum = revnum * 10 + d;
            n = n / 10;
        }
        return revnum == x; // Simplified return statement
    }
}
