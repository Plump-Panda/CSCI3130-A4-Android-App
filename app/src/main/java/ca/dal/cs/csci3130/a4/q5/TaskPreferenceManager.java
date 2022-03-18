package ca.dal.cs.csci3130.a4.q5;

import java.util.ArrayList;
import java.util.List;

public class TaskPreferenceManager implements IPreferenceManager {
    private List<Observer> users = new ArrayList<>();
    private int price;

    @Override
    public void attach(Observer user) {
        users.add(user);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int currentPrice) {
        price = currentPrice;
        notifyAllUsers();
    }

    @Override
    public void notifyAllUsers() {
        for(int i = 0; i < users.size(); i++){
            users.get(i).update(price);
        }
    }
}
