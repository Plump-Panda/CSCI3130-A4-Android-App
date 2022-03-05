package ca.dal.cs.csci3130.a4.q4;

public class MasterCard implements ICreditCard {

    int paidAmount;

    @Override
    public boolean payInCredit(int amount) {
        //buggy code + missing code
        System.out.println("Paid by Mastercard: " + amount);
        return false;
    }

    @Override
    public int getPaidAmount() {
        //buggy code
        return 0;
    }
}
