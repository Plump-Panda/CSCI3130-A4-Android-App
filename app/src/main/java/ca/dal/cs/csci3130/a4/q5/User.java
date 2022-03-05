package ca.dal.cs.csci3130.a4.q5;

public class User extends Observer {

    int bidIncrement = 0;
    int currentPrice;
    String currentMessage;

    public User(IPreferenceManager manager, int bidIncrement) {
        //required code is missing
    }

    @Override
    public void update(int newPrice) {
        //required code is missing
    }

    @Override
    public void update(String message) {
        //required code is missing
    }

    @Override
    public int getCurrentPrice() {
        return this.currentPrice;
    }

    @Override
    public String getCurrentMessage() {
        return this.currentMessage;
    }
}
