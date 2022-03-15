package ca.dal.cs.csci3130.a4.q2;

public class CashInTransaction implements Transaction {
    int point2Cash;
    int MINIMUM_POINTS = 500;

    public CashInTransaction(int point2Cash) {
        this.point2Cash = point2Cash;
    }

    public void performTransaction(ILoyaltyCard card) {
        if(!isLowPoints(card.getCurrentPoints())){
            card.setCurrentPoints(card.getCurrentPoints() - point2Cash);
        }
    }

    public boolean isLowPoints(int currentPoints) {
        return currentPoints < MINIMUM_POINTS;
    }

}
