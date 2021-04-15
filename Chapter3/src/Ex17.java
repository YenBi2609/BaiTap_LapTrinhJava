public class Ex17 {
    public static void main(String[] args) {
        int size = 8;
// a
        System.out.println("Cau a");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
// b
        System.out.println("Cau b");
        for (int row = 1; row <= size; row++) {
            for (int col = row; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
// c
        System.out.println("Cau c");
        for (int row = 1; row <= size; row++) {
            for (int col = 1 ; col <= size; col++) {
                if( col > row -1){
                System.out.print("# ");}
                else System.out.print("  ");
            }
            System.out.println();
        }
// cau d
        System.out.println("Cau d");
        for (int row = 1; row <= size; row++) {
            for (int col = 1 ; col <= size; col++) {
                if( col > size - row){
                    System.out.print("# ");}
                else System.out.print("  ");
            }
            System.out.println();
        }
// e
        int size1 = 7;
        System.out.println("Cau e");
        for (int row = 1; row <= size1; row++) {
            for (int col = 1 ; col <= size1; col++) {
                if( row ==1 || row == size1||col ==1 || col == size1){
                    System.out.print("# ");}
                else System.out.print("  ");
            }
            System.out.println();
        }
// f
        System.out.println("Cau f");
        for (int row = 1; row <= size1; row++) {
            for (int col = 1 ; col <= size1; col++) {
                if( row ==1 || row == size1||col ==row){
                    System.out.print("# ");}
                else System.out.print("  ");
            }
            System.out.println();
        }
// g
        System.out.println("Cau g");
        for (int row = 1; row <= size1; row++) {
            for (int col = 1 ; col <= size1; col++) {
                if( row ==1 || row == size1||col == size1 - row +1){
                    System.out.print("# ");}
                else System.out.print("  ");
            }
            System.out.println();
        }
// cau h
        System.out.println("Cau h");
        for (int row = 1; row <= size1; row++) {
            for (int col = 1 ; col <= size1; col++) {
                if( row ==1 || row == size1||col == size1 - row +1|| col ==row){
                    System.out.print("# ");}
                else System.out.print("  ");
            }
            System.out.println();
        }
// cau i
        System.out.println("Cau i");
        for (int row = 1; row <= size1; row++) {
            for (int col = 1 ; col <= size1; col++) {
                if( row ==1 || row == size1||col == size1 - row +1|| col ==row||col ==1 || col == size1){
                    System.out.print("# ");}
                else System.out.print("  ");
            }
            System.out.println();
        }
// cau j
        int n = 6;
        System.out.println("Cau j");
        for (int i = 1; i <= n; i++) {
            for (int j = 2 ; j <= i; j++) {
                System.out.print("  ");}
            for( int k = 1; k <= -2*i+13; k ++){
                System.out.print("# ");}
            System.out.println();
        }
// cau k
        System.out.println("Cau k");
        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= n-i; j++) {
                System.out.print("  ");}
            for( int k = 1; k <= 2*i -1; k ++){
                    System.out.print("# ");}
            System.out.println();
        }
// cau l
        System.out.println("Cau l");
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1 ; j <= n-i; j++) {
                System.out.print("  ");}
            for( int k = 1; k <= 2*i -1; k ++){
                System.out.print("# ");}
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 2 ; j <= i; j++) {
                System.out.print("  ");}
            for( int k = 1; k <= -2*i+13; k ++){
                System.out.print("# ");}
            System.out.println();
        }
    }
}
