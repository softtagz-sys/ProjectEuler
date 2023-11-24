public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int largestPalindrome = 0;
        int num1 = 0, num2 = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int product = i * j;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                    num1 = i;
                    num2 = j;
                }
            }
        }

        System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " + largestPalindrome);
        System.out.println("Numbers producing this palindrome: " + num1 + " and " + num2);
    }

    public static boolean isPalindrome(int number) {
        String strNumber = Integer.toString(number);
        int len = strNumber.length();
        for (int i = 0; i < len / 2; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
