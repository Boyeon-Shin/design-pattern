package strategy.ex1.strategies;

public class CreditCard {
    private int amount;
    private String number;
    private String data;
    private String cvv;

    public CreditCard(final String number, final String data, final String cvv) {
        this.number = number;
        this.data = data;
        this.cvv = cvv;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(final int amount) {
        this.amount = amount;
    }
}
