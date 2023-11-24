public class SumSquareDifference {
    public static void main(String[] args) {
        int n = 100;
        int sumOfSquares = 0;
        int sum = 0;

        // Calculate the sum of squares and the sum of the numbers
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            sum += i;
        }

        // Square of the sum
        int squareOfSum = sum * sum;

        // Calculate the difference
        int difference = squareOfSum - sumOfSquares;

        System.out.println("The difference between the sum of the squares and the square of the sum of the first " + n + " natural numbers is: " + difference);
    }
}
