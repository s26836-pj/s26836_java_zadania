public class Main {

    public static void Range( ) {
        Vehicle mySportsCar = new Vehicle("Auto sportowe", 2, 60, 20);
        Vehicle myMiniVan = new Vehicle("Minivan", 7, 70, 12);

        int summary = ((mySportsCar.getFuelCap() / mySportsCar.getFuelCons()) * 100);
        int summary1 = ((myMiniVan.getFuelCap() / myMiniVan.getFuelCons()) * 100);
        System.out.println(mySportsCar.getName() + " przewozi " + mySportsCar.getPaxNumber() + " pasażerów na odległość do " + summary + "km");
        System.out.println(myMiniVan.getName() + " przewozi " + myMiniVan.getPaxNumber() + " pasażerów na odległość do " + summary1 + "km");

    }
    public static void main(String[] args) {


        Range();
    }
}