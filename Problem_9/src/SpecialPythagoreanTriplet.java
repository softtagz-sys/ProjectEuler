public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        int sum = 1000;
        int product = findPythagoreanTripletProduct(sum);
        System.out.println("The product of the Pythagorean triplet whose sum is 1000 is: " + product);
    }

    public static int findPythagoreanTripletProduct(int sum) {
        for (int a = 1; a < sum / 3; a++) {
            for (int b = a + 1; b < sum / 2; b++) {
                int c = sum - a - b;
                if (a * a + b * b == c * c) {
                    return a * b * c;
                }
            }
        }
        return -1;
    }
}
