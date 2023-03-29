public class Vehicle {
    private final String name;
    private final double fuelCons;

    public String getName() {
        return this.name;
    }


    public double getFuelCons() {
        return fuelCons;
    }

    public Vehicle(String name, double fuelCons) {
        this.name = name;
        this.fuelCons = fuelCons;
    }

}
