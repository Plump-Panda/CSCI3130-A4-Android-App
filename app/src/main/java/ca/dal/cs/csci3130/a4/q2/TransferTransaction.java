package ca.dal.cs.csci3130.a4.q2;

public class TransferTransaction implements Transaction {

    ILoyaltyCard card;
    int MINIMUM_POINTS = 500;

    public TransferTransaction(ILoyaltyCard anotherCard) {
        card = anotherCard;
    }

    @Override
    public void performTransaction(ILoyaltyCard card) {
        if(!isLowPoints(card.getCurrentPoints())) {
            this.card.setCurrentPoints(card.getCurrentPoints() + this.card.getCurrentPoints());
            card.setCurrentPoints(0);

        }
    }

    public boolean isLowPoints(int currentPoints) {
        return currentPoints < MINIMUM_POINTS;
    }
}
