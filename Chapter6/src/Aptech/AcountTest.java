package Aptech;

import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AcountTest {
    public static void main(String[] args) throws NegativeAmountException, InsufficientFundException {
        Account i = new Account();
        Scanner input = new Scanner(System.in);
        byte index;
            do {
                System.out.println("Lựa chọn 1 hoạt động: ");
                System.out.println("1 - Create new account \n2 - Withdraw cash \n3 - Deposit cash \n4 - Exit");
                index = input.nextByte();
                if (index == 1) {
                    i.setAccount();
                } else if (index == 2) {
                    i.withdraw();
                } else if (index == 3) {
                    i.deposit();
                }
            } while (index != 4);
    }
}
