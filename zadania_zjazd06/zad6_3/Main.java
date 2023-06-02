import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Tworzenie drzewa tree1
        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("Czerwony");
        tree1.add("Niebieski");
        tree1.add("Zielony");
        tree1.add("Żółty");
        tree1.add("Fioletowy");

        // a. Wyświetlanie drzewa tree1
        System.out.println("Drzewo tree1:");
        for (String color : tree1) {
            System.out.println(color);
        }
        System.out.println();

        // b. Iteracja po wszystkich elementach drzewa tree1
        System.out.println("Elementy drzewa tree1:");
        Iterator<String> iterator = tree1.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }
        System.out.println();

        // c. Tworzenie drzewa tree2 i dodawanie jego elementów do tree1
        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Biały");
        tree2.add("Czarny");
        tree2.add("Różowy");

        // Wyświetlanie drzewa tree2
        System.out.println("Drzewo tree2:");
        for (String color : tree2) {
            System.out.println(color);
        }
        System.out.println();

        // Dodawanie elementów z drzewa tree2 do drzewa tree1
        tree1.addAll(tree2);

        // Wyświetlanie drzewa tree1 po dodaniu elementów z drzewa tree2
        System.out.println("Drzewo tree1 po dodaniu elementów z tree2:");
        for (String color : tree1) {
            System.out.println(color);
        }
        System.out.println();

        // d. Wyświetlanie elementów drzewa tree1 w odwrotnej kolejności
        System.out.println("Elementy drzewa tree1 w odwrotnej kolejności:");
        Iterator<String> reverseIterator = tree1.descendingIterator();
        while (reverseIterator.hasNext()) {
            String color = reverseIterator.next();
            System.out.println(color);
        }
        System.out.println();

        // e. Wyświetlanie pierwszego i ostatniego elementu drzewa tree1
        System.out.println("Pierwszy element drzewa tree1: " + tree1.first());
        System.out.println("Ostatni element drzewa tree1: " + tree1.last());
        System.out.println();

        // f. Klonowanie drzewa tree1 do tree3
        TreeSet<String> tree3 = new TreeSet<>(tree1);
        // Wypisanie drzewa tree3
        System.out.println("Drzewo tree3:");
        for (String color : tree3) {
            System.out.println(color);
        }
        System.out.println();

        // g. Wyświetlanie liczby elementów w drzewie tree1, tree2 i tree3
        System.out.println("Liczba elementów w drzewie tree1: " + tree1.size());
        System.out.println("Liczba elementów w drzewie tree2: " + tree2.size());
        System.out.println("Liczba elementów w drzewie tree3: " + tree3.size());
        System.out.println();

        // h. Porównywanie elementów drzewa tree1 i tree2
        System.out.println("Porównanie elementów drzewa tree1 i tree2:");
        TreeSet<String> commonElements = new TreeSet<>(tree1);
        commonElements.retainAll(tree2);
        System.out.println("Elementy wspólne:");
        for (String color : commonElements) {
            System.out.println(color);
        }
        System.out.println();

    }
}
