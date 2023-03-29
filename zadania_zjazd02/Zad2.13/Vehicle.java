public class Vehicle {
    private final String name;
    private final int paxNumber;
    private final int fuelCap;
    private final int fuelCons;

    public String getName() {
        return this.name;
    }


    public int getPaxNumber() {
        return paxNumber;
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public int getFuelCons() {
        return fuelCons;
    }

    public Vehicle(String name, int paxNumber, int fuelCap, int fuelCons) {
        this.name = name;
        this.paxNumber = paxNumber;
        this.fuelCap = fuelCap;
        this.fuelCons = fuelCons;
    }

}
