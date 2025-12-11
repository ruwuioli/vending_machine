package model;

public class BanknoteAcceptor implements PaymentReceiver{

    private int amount;

    public BanknoteAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public void startPayment() {
        System.out.println("Купюр на сумму: " + amount);
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void topUp() {
        amount += 50;
        System.out.println("Вы пополнили баланс на 50");
    }
}
