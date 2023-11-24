import java.math.BigInteger;

public class SmallestMultiple {
    // Function to calculate the GCD (Greatest Common Divisor)
    public static BigInteger gcd(BigInteger a, BigInteger b) {
        if (b.equals(BigInteger.ZERO))
            return a;
        return gcd(b, a.mod(b));
    }

    // Function to calculate the LCM (Least Common Multiple)
    public static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(gcd(a, b));
    }

    public static void main(String[] args) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= 20; i++) {
            result = lcm(result, BigInteger.valueOf(i));
        }

        System.out.println("The smallest positive number divisible by all numbers from 1 to 20 is: " + result);
    }
}
