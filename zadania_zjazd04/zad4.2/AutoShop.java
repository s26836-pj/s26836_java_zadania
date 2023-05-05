public class AutoShop {
    public static void main(String[] args) {

//Testy:
        Truck truck = new Truck(80, 40000, "Red", 2000);
        Ford ford = new Ford(120, 50000, "Blue", 2018, 3000);
        Sedan sedan = new Sedan(100, 30000, "Green", 22);

        System.out.println(truck.getPurchaseInfo() + "Sale price: " + truck.getSalePrice());
        System.out.println(ford.getPurchaseInfo() + "Sale price: " + ford.getSalePrice());
        System.out.println(sedan.getPurchaseInfo() + "Sale price: " + sedan.getSalePrice());
    }
}