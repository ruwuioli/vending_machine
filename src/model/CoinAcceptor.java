package model;

public class CoinAcceptor implements PaymentReceiver {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public void startPayment() {
        System.out.println("Монет на сумму: " + amount);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void topUp() {
        amount += 10;
        System.out.println("Вы пополнили баланс на 10");
    }
}
