public class OddEvenSu {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 10;
        int sumOdd = 0;
        int sumEven = 0;
        for (int number = lowerbound; number <= upperbound; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
// Print the result
        System.out.println("The sum of odd numbers from " + lowerbound + " to "
                + upperbound + " is " + sumOdd);

        System.out.println("The sum of even numbers from " + lowerbound
                + " to " + upperbound + " is " + sumEven);
    }
}
