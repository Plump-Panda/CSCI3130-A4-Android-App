package ca.dal.cs.csci3130.a4.q4;

public class SmartCard implements IDebitCard {
    SmartCardAdapter adapter;
    int paidAmount;

    public SmartCard(SmartCardAdapter adapter) {
        //required code is missing
    }

    @Override
    public boolean pay(String paymentType, int amount) {
        boolean paid = false;
        //required code is missing
        return paid;
    }

    @Override
    public int getPaidAmount() {
        //buggy code
        return 0;
    }
}
