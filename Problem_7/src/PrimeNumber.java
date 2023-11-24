public class PrimeNumber {

    public static void main(String[] args) {
        int n = 10001;
        int prime = findNthPrime(n);
        System.out.println("The " + n + "st prime number is: " + prime);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findNthPrime(int n) {
        int count = 0;
        int num = 2; // Starting from 2, the first prime number
        while (count < n) {
            if (isPrime(num)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
            num++;
        }
        return -1; // In case of failure
    }
}
