package ca.dal.cs.csci3130.a4.q2;


public class BuyProduceTransaction implements Transaction {

    int points2Buy;
    int MINIMUM_POINTS = 500;

    public BuyProduceTransaction(int points2Buy) {
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
