package ca.dal.cs.csci3130.a4.q4;

public class SmartCardAdapter implements IDebitCard {
    ICreditCard creditCard;

    public SmartCardAdapter(ICreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public boolean pay(String paymentType, int amount) {
        creditCard.payInCredit(amount);
        return true;
    }

    @Override
    public int getPaidAmount() {
        return creditCard.getPaidAmount();
    }
}
