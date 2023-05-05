public class Truck extends Car implements Purchase {

    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return super.regularPrice * 0.9;
        } else {
            return super.regularPrice;
        }
    }

    @Override
    public String getPurchaseInfo() {
        return "TRUCK: ";
    }

}


