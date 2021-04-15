public class Ex18 {
    public static void main(String[] args) {
        int size = 8;
// m
        System.out.println("Cau m");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
// q
        System.out.println("Cau q");
        for (int i = 1; i <= size; i++) {
            for (int j = 1 ; j <= size-i; j++) {
                System.out.print("  ");}

            for (int col = 1; col <= i; col++) {
                System.out.print(col +" ");
            }
            if( i  != 1) {
                for (int k = 1; k < i; k++) {
                    System.out.print(k + " ");
                }
            }

            System.out.println();
        }
// u
        System.out.println("Cau u");
        for (int i = 1; i <= size; i++) {
            for (int j = 1 ; j <= size-i; j++) {
                System.out.print("  ");}

            for (int col = i; col <= 2*i-1; col++) {
                if( col >= 10) {
                    System.out.print((col % 10) + " ");
                }
                else System.out.print(col + " ");
            }
            if( i  != 1) {
                for (int k = 2*i -2; k >= i; k--) {
                    if( k >= 10) {
                        System.out.print((k % 10) + " ");
                    }
                    else System.out.print(k + " ");
                }
            }
            System.out.println();
        }
    }
}
