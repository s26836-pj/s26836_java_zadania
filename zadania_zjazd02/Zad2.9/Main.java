import java.util.Random;
import java.util.Scanner;

class Gra {
    private static final Random rand = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static final char[] LITERY = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static void main(String[] args) {
        boolean wygrana = false;

        while (!wygrana) {
            char litera = losujLiterke();
            System.out.print("Podaj literę z zakresu od A do Z: ");
            char odpowiedz = scanner.nextLine().toUpperCase().charAt(0);

            if (odpowiedz == litera) {
                System.out.println("Dobrze!");
                wygrana = true;
            } else {
                System.out.println("Źle!");
                if (odpowiedz < litera) {
                    System.out.println("Literka była bliżej końca alfabetu.");
                } else {
                    System.out.println("Literka była bliżej początku alfabetu.");
                }
            }
        }
    }

    private static char losujLiterke() {
        int indeks = rand.nextInt(LITERY.length);
        return LITERY[indeks];
    }
}
