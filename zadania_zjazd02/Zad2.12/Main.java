public class Main {

    public static int Range(Vehicle vehicle) {
        return ((vehicle.getFuelCap() / vehicle.getFuelCons()) * 100);
    }
    public static void main(String[] args) {


        Vehicle mySportsCar = new Vehicle("Auto sportowe", 2, 60, 20);
        Vehicle myMiniVan = new Vehicle("Minivan", 7, 70, 12);


        System.out.println(mySportsCar.getName() + " przewozi " + mySportsCar.getPaxNumber() + " osoby");
        System.out.println("Zbiornik paliwa pomiesci " + mySportsCar.getFuelCap()+ "l" + ", a srednie zuzycie na 100km to: " + mySportsCar.getFuelCons()+"l");
        System.out.println("Zasieg: " + Range(mySportsCar) + "km\n");
        System.out.println(myMiniVan.getName() + " przewozi " + myMiniVan.getPaxNumber() + " osob");
        System.out.println("Zbiornik paliwa pomiesci " + myMiniVan.getFuelCap()+ "l" + ", a srednie zuzycie na 100km to: " + myMiniVan.getFuelCons()+"l");
        System.out.println("Zasieg: " + Range(myMiniVan) + "km");

    }
}