package ca.dal.cs.csci3130.a4.q2;


public class BuyProduceTransaction implements Transaction {

    int points2Buy;
    int MINIMUM_POINTS = 500;

    public BuyProduceTransaction(int points2Buy) {
        this.points2Buy = points2Buy;
    }

    @Override
    public void performTransaction(ILoyaltyCard card) {
        if(!isLowPoints(card.getCurrentPoints())) {
            card.setCurrentPoints(card.getCurrentPoints() - points2Buy);
        }
    }

    public boolean isLowPoints(int currentPoints) {
        return currentPoints < MINIMUM_POINTS;
    }


}
