package model;

public class Fingerprint implements Traceable {

    Person owner;
    String precinct;

    public Fingerprint(Person person, String location) {
        this.owner = person;
        this.precinct = location;
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
