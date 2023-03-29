public class Main {

    public static void Range() {
        Vehicle mySportsCar = new Vehicle("Auto sportowe", 19.8);
        Vehicle myMiniVan = new Vehicle("Minivan", 12);

        double summary = (mySportsCar.getFuelCons() / 100.00);
        double summary1 = (myMiniVan.getFuelCons() /  100.00);
        System.out.printf("%s potrzebuje %.2f litrow paliwa do przejechania %.0f km%n", mySportsCar.getName(), (summary * 431), 431.0);
        System.out.printf("%s potrzebuje %.2f litrow paliwa do przejechania %.0f km%n", myMiniVan.getName(), (summary1 * 431), 431.0);

    }
    public static void main(String[] args) {


        Range();
    }
}