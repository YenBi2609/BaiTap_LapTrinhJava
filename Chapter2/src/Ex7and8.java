import java.util.Scanner;

public class Ex7and8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Số giờ làm việc trong tuần :");
        double soGioLamViec = in.nextDouble();
        if(soGioLamViec > 48)
            System.out.println("Vượt quy định số giờ làm tối thiểu trong 1 tuần");

        System.out.println("Lương 1 giờ :");
        double luong1h = in.nextDouble();
        if(luong1h < 5.15)
            System.out.println("Lương thấp hơn mức lương tối thiểu");
        System.out.println("Tiền lương cần trả : " + soGioLamViec*luong1h);
    }
}
