package model;

public class Fingerprint implements Traceable {

    Person owner;
    String precinct;

    public Fingerprint(Person p, String l) {
        this.owner = p;
        this.precinct = l;
        owner.setFingerprint(this);
    }
    @Override
    public String getLocation() {
        return owner.lastKnownAddress;
    }

    @Override
    public Object getTrace() {
        return this;
    }

    @Override
    public void Track() {
        System.out.println("Tracking fingerprint of" + owner.name);
    }
}
