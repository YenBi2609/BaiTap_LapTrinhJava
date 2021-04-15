package Aptech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {
    private String accountName;
    private int accountNumber;
    private double accountBalance;
    public Account ac[];

    public String getAccountName() {
        return accountName;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public Account(){

    }

    public Account(String accountName, int accountNumber, double accountBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void setAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("Số lượng tài khoản bạn muốn tạo: ");
        try {
            int size = input.nextInt();
            ac = new Account[size];
            for (int i = 0; i < size; i++) {
                System.out.printf("Nhập thông tin tài khoản %d", i + 1);
                input.nextLine();
                System.out.println("\nTên tài khoản: ");
                String name = input.nextLine();
                System.out.println("Số tài khoản: ");
                int number = input.nextInt();
                System.out.println("Số dư tài khoản: ");
                double balance = input.nextDouble();
                ac[i] = new Account(name, number, balance);
            }
        }catch(InputMismatchException e){
            System.out.println("Nhập sai kiểu dữ liệu");
        }
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void displayAccountDetails(){
        System.out.println("Account name: "+ accountName
                           +", Account number: " + accountNumber
                           +", Account balance: "+ accountBalance);
    }
    public void withdraw() throws InsufficientFundException{
        Scanner input = new Scanner(System.in);
        System.out.println("Danh sách các tài khoản: ");
          try {
              assert ac != null : "Không có tài khoản nào";
              for (int i = 0; i < ac.length; i++) {
                  System.out.println(i + ". " + ac[i].getAccountNumber());
              }
              System.out.println("Nhập thứ tự số tài khoản bạn muốn rút tiền trong danh sách");
              int i = input.nextInt();
              System.out.println("Số tiền bạn muốn rút: ");
              double amount = input.nextDouble();
              assert amount > 0 : "Số tiền rút phải dương";
              assert ac[i].accountBalance > 0 : "Số tiền trong tài khoản đang âm";
              if (amount > ac[i].accountBalance) {
                  throw new InsufficientFundException(ac[i], amount, "Withdraw");
              } else ac[i].accountBalance -= amount;
              System.out.println("Rút tiền thành công !");
              ac[i].displayAccountDetails();
          }
          catch (InputMismatchException e){
              System.out.println("Nhập sai kiểu dữ liệu");
          }
          catch(ArrayIndexOutOfBoundsException e){
              System.out.println("Chỉ số không hợp lệ");
          }

    }
    public void deposit() throws NegativeAmountException{
        Scanner input = new Scanner(System.in);
        System.out.println("Danh sách các tài khoản: ");
       try {
           assert ac != null : "Không có tài khoản nào";
           for (int i = 0; i < ac.length; i++) {
               System.out.println(i + ". " + ac[i].getAccountNumber());
           }
           System.out.println("Nhập thứ tự số tài khoản bạn muốn gửi tiền trong danh sách");
           int i = input.nextInt();
           System.out.println("Số tiền bạn muốn gửi: ");
           double amount = input.nextDouble();
           assert ac[i].accountBalance > 0 : "Số tiền trong tài khoản đang âm";
           if (amount < 0) {
               throw new NegativeAmountException(ac[i], amount);
           } else ac[i].accountBalance += amount;
           System.out.println("Gửi tiền thành công !");
           ac[i].displayAccountDetails();
       }
       catch(InputMismatchException e){
           System.out.println("Nhập sai kiểu dữ liệu.");
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Số thứ tự không có trong danh sách");
       }
    }
}
