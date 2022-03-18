package ca.dal.cs.csci3130.a4.q5;

import java.util.ArrayList;
import java.util.List;

public class GoodsPreferenceManager implements IPreferenceManager {

    private List<Observer> users = new ArrayList<>();
    private String message;

    @Override
    public void attach(Observer user) {
        users.add(user);
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllUsers();
    }

    @Override
    public void notifyAllUsers() {
        for(int i = 0; i < users.size(); i++){
            users.get(i).update(message);
        }
    }

}
