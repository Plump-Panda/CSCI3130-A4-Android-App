package ca.dal.cs.csci3130.a4.q2;

public class CashInTransaction implements Transaction {
    int point2Cash;
    int MINIMUM_POINTS = 500;

    public CashInTransaction(int point2Cash) {
        //required code is missing
    }

    public void performTransaction(ILoyaltyCard card) {
        //required code is missing
    }

    public boolean isLowPoints(int currentPoints) {
        return currentPoints < MINIMUM_POINTS;
    }

}
