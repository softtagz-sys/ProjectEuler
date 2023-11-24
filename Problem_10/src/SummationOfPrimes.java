public class SummationOfPrimes {
    public static void main(String[] args) {
        int limit = 2000000;
        long sum = sumOfPrimesBelowLimit(limit);
        System.out.println("The sum of all primes below two million is: " + sum);
    }

    public static long sumOfPrimesBelowLimit(int limit) {
        boolean[] primes = new boolean[limit];
        long sum = 0;

        for (int i = 2; i < limit; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p < limit; p++) {
            if (primes[p]) {
                for (int i = p * p; i < limit; i += p) {
                    primes[i] = false;
                }
            }
        }

        for (int i = 2; i < limit; i++) {
            if (primes[i]) {
                sum += i;
            }
        }

        return sum;
    }
}
