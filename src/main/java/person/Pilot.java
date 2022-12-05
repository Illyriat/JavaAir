package person;

import person.Rank;

public class Pilot extends CabinCrew{

    private Rank rank;
    private int licenceNumber;
    public Pilot(String name, Rank rank, int licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public int getLicenceNumber() {
        return licenceNumber;
    }

    public String flyPlane() {
        return String.format("JavaAir Flight 243 preparing for take off.");
    }
}
