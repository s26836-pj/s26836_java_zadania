package zad5_1;

import java.util.ArrayList;

public class Zad5_1 {
    private ArrayList<Integer> numbers;

    public Zad5_1() {
        numbers = new ArrayList<>();
    }
    public void generateNumbers(int count) {
        for (int i = 1; numbers.size() < count; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
    }
    public void printNumbers() {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Indeks: " + i + ", Liczba: " + numbers.get(i));
        }
    }
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        Zad5_1 zad = new Zad5_1();
        zad.generateNumbers(50);
        zad.printNumbers();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Czas w milisekundach

        System.out.println("Czas całej operacji: " + duration + " ms");

    }
}

