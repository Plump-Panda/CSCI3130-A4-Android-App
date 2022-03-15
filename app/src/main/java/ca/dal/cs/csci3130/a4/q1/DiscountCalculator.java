package ca.dal.cs.csci3130.a4.q1;

public class DiscountCalculator implements DiscountCalculationRule {

    double discountRate;

    public DiscountCalculator(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double calculate(CustomerSRP customer) {
        return discountRate * customer.getLoyaltyCard().getCurrentPoints();
    }
}
