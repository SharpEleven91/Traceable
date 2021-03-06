package model;

import java.util.ArrayList;

public class CellPhone implements Traceable {
    ArrayList<Call> callHistory;
    String location;
    Person phoneOwner;

    public CellPhone(Person p, String l) {
        this.phoneOwner = p;
        this.location = l;
        this.callHistory = new ArrayList();
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public Object getTrace() {
        return this;
    }

    @Override
    public void Track() {
    }

    public void printCallHistory() {
        for (Call c : callHistory) {
            System.out.println(c.outgoingCaller + " from " + c.getLocation());
        }
    }

    public void addCall(Call c) {
        callHistory.add(c);
    }
    // Getters
    public Person getPhoneOwner() {
        return this.phoneOwner;
    }

    public ArrayList getCallHistory() {
        return this.callHistory;
    }

    // Setters
    public void setLocation(String l) {
        this.location = l;
    }


}
