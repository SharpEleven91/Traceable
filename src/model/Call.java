package model;

public class Call implements Traceable {

    CellPhone outgoingCaller;
    String callLocation;

    public Call(CellPhone c, String cl) {
        this.outgoingCaller = c;
        this.callLocation = cl;
    }
    @Override
    public String getLocation() {
        return this.callLocation;
    }

    @Override
    public Object getTrace() {
        return this;
    }

    @Override
    public void Track() {
        System.out.println("Tracking Call...");
    }

    // Getters

    public CellPhone getOutgoingCaller() {
        return this.outgoingCaller;
    }
}
