public class Vehicle {
    private String name;
    private int paxNumber;
    private int fuelCap;
    private int fuelCons;

    public String getName() {
        return this.name;
    }

    public void setPaxNumber(int paxNumber) {
        this.paxNumber = paxNumber;
    }

    public void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }

    public void setFuelCons(int fuelCons) {
        this.fuelCons = fuelCons;
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

}
