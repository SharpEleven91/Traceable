package model;

public class Person implements Traceable {

    int age;
    String name;
    String lastKnownAddress;
    Fingerprint fingerprint;

    public Person(int age, String name, String lastKnownAddress) {
        this.age = age;
        this.name = name;
        this.lastKnownAddress = lastKnownAddress;
        this.fingerprint = null;
    }
    @Override
    public String getLocation() {
        return this.lastKnownAddress;
    }

    @Override
    public Object getTrace() {
        return this;
    }

    @Override
    public void Track() {
        System.out.println("Tracking " + name);
    }

    // Getters

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getLastKnownAddress() {
        return this.lastKnownAddress;
    }

    public Fingerprint getFingerprint() {
        return this.fingerprint;
    }

    // Setters

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastKnownAddress(String loc) {
        this.lastKnownAddress = loc;
    }

    public void setFingerprint(Fingerprint fp) {
        this.fingerprint = fp;
    }
}
