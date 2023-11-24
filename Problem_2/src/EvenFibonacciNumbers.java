
//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int limit = 4000000;
        int sum = 0;
        int a = 1;
        int b = 2;

        while (b <= limit) {
            if (b % 2 == 0) {
                sum += b;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println(sum);

    }
}
