package ca.dal.cs.csci3130.a4;

import org.junit.Test;

import ca.dal.cs.csci3130.a4.q2.BuyProduceTransaction;
import ca.dal.cs.csci3130.a4.q2.CashInTransaction;
import ca.dal.cs.csci3130.a4.q2.ILoyaltyCard;
import ca.dal.cs.csci3130.a4.q2.LoyaltyCard;
import ca.dal.cs.csci3130.a4.q2.SmartLoyaltyCard;
import ca.dal.cs.csci3130.a4.q2.Transaction;
import ca.dal.cs.csci3130.a4.q2.TransferTransaction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoyaltyCardTest {

    @Test
    public void testOldCardOperations() {
        LoyaltyCard card = new LoyaltyCard(1800);
        card.performTransaction(1, 300, null);
        assertTrue(card.cashIn(500));
        LoyaltyCard newCard = new LoyaltyCard(0);
        assertTrue(card.transfer(newCard));
        assertEquals(1000, newCard.getCurrentPoints());
        assertFalse(card.cashIn(500));
    }

    @Test
    public void testCashIn() {
        ILoyaltyCard card = new SmartLoyaltyCard(1000);
        Transaction transaction = new CashInTransaction(600);
        card.performTransaction(transaction);
        assertEquals(400, card.getCurrentPoints());
        card.performTransaction(transaction);
        assertEquals(400, card.getCurrentPoints());
    }

    @Test
    public void testTransfer() {
        ILoyaltyCard firstCard = new SmartLoyaltyCard(1000);
        ILoyaltyCard secondCard = new SmartLoyaltyCard(0);
        Transaction transaction = new TransferTransaction(secondCard);
        firstCard.performTransaction(transaction);
        assertEquals(0, firstCard.getCurrentPoints());
        assertEquals(1000, secondCard.getCurrentPoints());
    }

    @Test
    public void testBuyProduce() {
        ILoyaltyCard card = new SmartLoyaltyCard(1000);
        Transaction transaction = new BuyProduceTransaction(700);
        card.performTransaction(transaction);
        assertEquals(300, card.getCurrentPoints());
        card.performTransaction(transaction);
        assertEquals(300, card.getCurrentPoints());
    }

    @Test
    public void testAllTransactions() {
        ILoyaltyCard firstCard = new SmartLoyaltyCard(1000);
        ILoyaltyCard secondCard = new SmartLoyaltyCard(0);
        Transaction cashIn = new CashInTransaction(250);
        firstCard.performTransaction(cashIn);
        assertEquals(750, firstCard.getCurrentPoints());

        Transaction buyProduce = new BuyProduceTransaction(200);
        firstCard.performTransaction(buyProduce);
        assertEquals(550, firstCard.getCurrentPoints());

        Transaction transfer = new TransferTransaction(secondCard);
        firstCard.performTransaction(transfer);
        assertEquals(0, firstCard.getCurrentPoints());
        assertEquals(550, secondCard.getCurrentPoints());
    }
}
