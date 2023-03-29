public class Main {
    public static void main(String[] args) {

        Student studen = new Student();
        studen.imie = "Blazej";
        studen.grupa = 22;
        studen.nazwisko = "Kanczkowski";
        studen.kierunek = "Informatyka";

        System.out.println("imie: " + studen.imie);
        System.out.println("nazwisko: " + studen.nazwisko);
        System.out.println("grupa: " + studen.grupa);
        System.out.println("kierunek: " + studen.kierunek);
    }
}