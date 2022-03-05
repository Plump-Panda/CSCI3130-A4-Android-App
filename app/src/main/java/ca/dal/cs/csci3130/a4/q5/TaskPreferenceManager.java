package ca.dal.cs.csci3130.a4.q5;

import java.util.ArrayList;
import java.util.List;

public class TaskPreferenceManager implements IPreferenceManager {
    private List<Observer> users = new ArrayList<>();
    private int price;

    @Override
    public void attach(Observer user) {
        //required code is missing
    }

    public int getPrice() {
        //buggy code
        return 0;
    }

    public void setPrice(int currentPrice) {
        //required code is missing
    }

    @Override
    public void notifyAllUsers() {
        //required code is missing
    }
}
