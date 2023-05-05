public class Sedan extends Car implements Purchase {

    int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) {
            return super.regularPrice * 0.95;
        } else
            return super.regularPrice;
    }

    @Override
    public String getPurchaseInfo() {
        return "SEDAN: ";
    }
}
