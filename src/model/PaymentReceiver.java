package model;

public interface PaymentReceiver {

    void startPayment();

    int getAmount();

    void setAmount(int amount);

    void topUp();
}
