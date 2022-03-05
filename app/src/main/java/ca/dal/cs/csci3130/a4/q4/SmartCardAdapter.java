package ca.dal.cs.csci3130.a4.q4;

public class SmartCardAdapter implements IDebitCard {
    ICreditCard creditCard;

    public SmartCardAdapter(ICreditCard creditCard) {
        //required code is missing
    }

    @Override
    public boolean pay(String paymentType, int amount) {
        //missing code + buggy code
        return true;
    }

    @Override
    public int getPaidAmount() {
        //buggy code
        return 0;
    }
}
