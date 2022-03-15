package ca.dal.cs.csci3130.a4.q1;

public class Membership {
    DiscountCalculationRule rule;

    public Membership(DiscountCalculationRule rule) {
        this.rule = rule;
    }

    protected DiscountCalculationRule getRule() {
        return rule;
    }
}
