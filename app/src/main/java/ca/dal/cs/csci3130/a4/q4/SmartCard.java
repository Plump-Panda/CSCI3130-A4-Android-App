package ca.dal.cs.csci3130.a4.q4;

public class SmartCard implements IDebitCard {
    SmartCardAdapter adapter;
    int paidAmount;

    public SmartCard(SmartCardAdapter adapter) {
        this.adapter = adapter;
        paidAmount = 0;
    }

    @Override
    public boolean pay(String paymentType, int amount) {
        if (!paymentType.equals(CardConstants.DEBIT_PAYMENT)) {
            adapter.pay(CardConstants.CREDIT_PAYMENT, amount);
        }
        paidAmount += amount;
        return true;
    }

    @Override
    public int getPaidAmount() {
        return paidAmount;
    }
}
