public class Ex12 {
    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            for( int j =1 ; j < 11; j++){
                System.out.print(j*i);
                if((j*i < 10)) {
                    System.out.print("      ");
                }
                else System.out.print("     ");
            }
            System.out.println();
        }
    }
}
