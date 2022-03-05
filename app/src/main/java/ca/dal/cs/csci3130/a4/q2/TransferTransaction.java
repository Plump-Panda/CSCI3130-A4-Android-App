package ca.dal.cs.csci3130.a4.q2;

public class TransferTransaction implements Transaction {

    ILoyaltyCard card;
    int MINIMUM_POINTS = 500;

    public TransferTransaction(ILoyaltyCard anotherCard) {
        //required code is missing
    }

    @Override
    public void performTransaction(ILoyaltyCard card) {
        //required code is missing
    }

    public boolean isLowPoints(int currentPoints) {
        return currentPoints < MINIMUM_POINTS;
    }
}
