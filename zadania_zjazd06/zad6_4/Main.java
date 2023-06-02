import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tworzenie mapy numer-miesiąc
        Map<Integer, String> miesiace = new HashMap<>();
        miesiace.put(1, "Styczeń");
        miesiace.put(2, "Luty");
        miesiace.put(3, "Marzec");
        miesiace.put(4, "Kwiecień");
        miesiace.put(5, "Maj");
        miesiace.put(6, "Czerwiec");
        miesiace.put(7, "Lipiec");
        miesiace.put(8, "Sierpień");
        miesiace.put(9, "Wrzesień");
        miesiace.put(10, "Październik");
        miesiace.put(11, "Listopad");
        miesiace.put(12, "Grudzień");

        // Pobieranie liczby od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer miesiąca (1-12): ");
        int numer = scanner.nextInt();

        // Sprawdzanie poprawności numeru miesiąca i wypisywanie odpowiedzi
        if (miesiace.containsKey(numer)) {
            String nazwaMiesiaca = miesiace.get(numer);
            System.out.println("Miesiąc o numerze " + numer + " to " + nazwaMiesiaca + ".");
        } else {
            System.out.println("Podano niepoprawny numer miesiąca.");
        }
        System.out.println("Wszystkie miesiace: \n" + miesiace);
    }
}
