import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Dodawanie elementów do HashSet
        set.add("a");
        set.add("b");
        set.add("c");

        System.out.println(set);
        System.out.println();

        // Konwersja HashSet na tablicę
        String[] array = set.toArray(new String[0]);

        // Wyświetlanie tablicy
        for (String element : array) {
            System.out.println(element);
        }
    }
}
