import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Walec walec = new Walec();
        System.out.println("Podaj promien walca: ");
        int promien = scanner.nextInt();
        System.out.println("Podaj wysokosc walca: ");
        int wysokosc = scanner.nextInt();
        walec.setWysokosc(wysokosc);
        walec.setPromien(promien);


        System.out.println(String.format("%.2f", Math.PI * walec.getWysokosc() * walec.getPromien() * walec.getPromien()));

    }
}