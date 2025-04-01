package strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        try{
            System.out.println("Enter the card number: ");
            String number = READER.readLine();
            System.out.println("Enter the card expiration data 'mm/yy: ");
            String data = READER.readLine();
            System.out.println("Enter the cvv Code: ");
            String cvv = READER.readLine();

            card = new CreditCard(number, data, cvv);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean pay(final int paymentAmount) {
        if(cardIsPresent()) {
            System.out.println("Paying" + paymentAmount + "using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
