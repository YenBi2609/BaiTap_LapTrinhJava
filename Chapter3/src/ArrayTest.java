public class ArrayTest {
    public static void main(String[] args) {
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum = 0;
        double avg;
        int count = marks.length;

        for (int i=0; i<count; i++) {

            sum += marks[i];

        }
        avg = (double)sum/count;
        System.out.printf("Sum is %d\n", sum);
        System.out.printf("Avegare is %.2f\n", avg);
    }
}
