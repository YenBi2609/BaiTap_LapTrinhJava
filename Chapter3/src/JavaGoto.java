public class JavaGoto {
    public static void main(String[] args) {
        int max = 4;
        int limit = 2;
        out:
        for (int row = 1; row <= max; row++) {
            for (int col = 1; col <= max; col++) {
                System.out.printf("col=%d, row=%d\n", row, col);
                if (row == limit) {
                    break out;
                }
            }
        }
    }
}