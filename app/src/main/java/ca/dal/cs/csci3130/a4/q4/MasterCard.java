package ca.dal.cs.csci3130.a4.q4;

public class MasterCard implements ICreditCard {

    int paidAmount;

    @Override
    public boolean payInCredit(int amount) {
        System.out.println("Paid by Mastercard: " + amount);
        paidAmount = amount;
        return true;
    }

    @Override
    public int getPaidAmount() {
        return paidAmount;
    }
}
