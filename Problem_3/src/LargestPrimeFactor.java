
//What is the largest prime factor of the number 600851475143?

public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475143L;
        long largestPrimeFactor = getLargestPrimeFactor(number);
        System.out.println("The largest prime factor of " + number + " is: " + largestPrimeFactor);
    }

    public static long getLargestPrimeFactor(long number) {
        long largestPrimeFactor = 1;
        while (number % 2 == 0) {
            largestPrimeFactor = 2;
            number /= 2;
        }

        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrimeFactor = i;
                number /= i;
            }
        }

        if (number > 2) {
            largestPrimeFactor = number;
        }
        return largestPrimeFactor;
    }
}
