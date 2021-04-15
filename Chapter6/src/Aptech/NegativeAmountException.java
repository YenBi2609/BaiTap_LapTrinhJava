package Aptech;

public class NegativeAmountException extends Exception{
    private double amount;

    public NegativeAmountException(Account i,double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Số tiền bạn rút/gửi bị âm" +
                ", amount=" + amount +
                '}';
    }
}
