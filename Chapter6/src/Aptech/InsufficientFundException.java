package Aptech;

public class InsufficientFundException extends Exception{
    private double amount;
    private String transactionType;

    public InsufficientFundException(Account i, double amount, String transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "Số tiền bạn rút vượt quá số dư trong tài khoản" +
                ", amount =" + amount ;

    }
}
