import java.sql.SQLOutput;
        import java.util.Arrays;
        import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

         Zad_01();
         Zad_02();
         Zad_03();
         Zad_04();
         Zad_05();
         Zad_06();
         Zad_07();
         Zad_08();
         Zad_09();
         Zad_10();
         Zad_11();
         Zad_12();
         Zad_13();
    }

    public static void Zad_01() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc bokow prostokata");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = number1 * number2;
        System.out.println("Pole prostokata: " + sum);
    }

    public static void Zad_02() {

        double sum;
        double pi;
        pi = 3.14;
        sum = Math.sqrt(pi);
        sum = Math.round(sum * 100.0) / 100.0;
        System.out.println("Pierwiastek kwadratowy z liczby pi " + sum);
    }

    public static void Zad_03() {

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj dwa slowa: ");

        String napis = input.nextLine();
        String[] podzielonyNapis = napis.split(" ");
        String napis1 = podzielonyNapis[0];
        String napis2 = podzielonyNapis[1];

        System.out.println("\"%" + napis2 + " " + napis1 + "%\"");

    }

    public static void Zad_04() {

        System.out.println("Podaj boki trójkąta");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c = scanner.nextInt();
        int b = scanner.nextInt();

        if ((a + b > c && a + c > b && b + c > a) || (a == b && b == c)) {
            System.out.println("TAK");
        } else if (a < 0 || b < 0 || c < 0) {
            System.out.println("BŁĄD");
        } else {
            System.out.println("NIE");
        }

    }

    public static void Zad_05() {

        System.out.println("Wybierz miesiąc: ");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        switch (number) {
            case 1 -> System.out.println("Styczeń: 31 dni");
            case 2 -> System.out.println("Luty: 28 dni");
            case 3 -> System.out.println("Marzec: 31 dni");
            case 4 -> System.out.println("Kwiecień: 30 dni");
            case 5 -> System.out.println("Maj: 31 dni");
            case 6 -> System.out.println("Czerwiec: 30 dni");
            case 7 -> System.out.println("Lipiec: 31 dni");
            case 8 -> System.out.println("Sierpień: 31 dni");
            case 9 -> System.out.println("Wrzesień: 30 dni");
            case 10 -> System.out.println("Październik: 31 dni");
            case 11 -> System.out.println("Listopad: 30 dni");
            case 12 -> System.out.println("Grudzień: 31 dni");
            default -> System.out.println("BŁĄD");
        }
    }

    public static void Zad_06() {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz 3 dowolne cyfry: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a + " " + b + " " + c);
        System.out.println(c + " " + b + " " + a);
    }

    public static void Zad_07() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablic: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        if (n != m) {
            System.out.println("BŁĄD");
            return;
        }

        System.out.println("Wprowadź elementy tablicy A:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Wprowadź elementy tablicy B:");
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        int iloczynSkalarny = 0;
        for (int i = 0; i < n; i++) {
            iloczynSkalarny += a[i] * b[i];
        }

        System.out.println("Iloczyn skalarny: " + iloczynSkalarny);
    }

    public static void Zad_08() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkosc obrazka: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= 2) {
                    if (j <= i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j <= n - i - 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void Zad_09() {
        Scanner scanner = new Scanner(System.in);

        boolean spr = true;
        System.out.println("Podaj slowo aby sprawdzic czy jest palindromem: ");
        String word = scanner.nextLine();
        char[] tmp = word.toCharArray();

        for (int i = 0; i < tmp.length; i++) {
            char[] reverse = new char[tmp.length];
            reverse[i] = tmp[tmp.length - 1 - i];
            if (reverse[i] != tmp[i]) {
                spr = false;
                break;
            } else continue;
        }
        if (spr) {
            System.out.println("TAK");
        } else System.out.println("NIE");
    }

    public static void Zad_10() {
        Scanner scanner = new Scanner(System.in);
        int columns;
        int rows;

        System.out.println("Podaj wymiary tablicy:");
        rows = scanner.nextInt();
        columns = scanner.nextInt();
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Podaj wartosc wiesz: " + (i + 1));
                System.out.print(" kolumna: " + (j + 1) + " \n");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] arrayT = new int[columns][rows];
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {

                arrayT[j][i] = array[i][j];
                System.out.print(arrayT[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void Zad_11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz zdanie aby zobacyz czy jest to panagram: ");
        String sentence = scanner.nextLine();
        if (containsAllLetters(sentence)) {
            System.out.println("true");
        } else {
            System.out.println("no");
        }
    }

    public static boolean containsAllLetters(String sentence) {
        char[] array = new char[26];
        for (int i = 0; i < 26; i++) {
            array[i] = (char) ('a' + i);
        }
        boolean containsAllLetters = false;
        for (char a : array) {
            sentence = sentence.toLowerCase();
            if (sentence.indexOf(a) >= 0) {
                containsAllLetters = true;
            } else {
                containsAllLetters = false;
                break;
            }
        }
        return containsAllLetters;
    }

    public static void Zad_12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek w sekundach: ");
        int age = scanner.nextInt();
        while (true) {
            System.out.println("\n1. Merkury ");
            System.out.println("2. Wenus ");
            System.out.println("3. Mars ");
            System.out.println("4. Jowisz ");
            System.out.println("5. Saturn ");
            System.out.println("6. Uran ");
            System.out.println("7. Neptun ");
            System.out.println("8. Ziemia ");
            System.out.println("9. Exit ");
            System.out.println("Wybierz planete: ");
            int numb = scanner.nextInt();
            double planetAge = howManyYears(age, numb);
            switch (numb) {
                case 1 -> {
                    System.out.printf("Twoj wiek na planecie Markury to %.2f lat\n", planetAge);
                    break;
                }
                case 2 -> {
                    System.out.printf("Twoj wiek na planecie Wenus to %.2f lat\n", planetAge);
                    break;
                }
                case 3 -> {
                    System.out.printf("Twoj wiek na planecie Mars to %.2f lat\n", planetAge);
                    break;
                }
                case 4 -> {
                    System.out.printf("nTwoj wiek na planecie Jowisz to %.2f lat\n", planetAge);
                    break;
                }
                case 5 -> {
                    System.out.printf("Twoj wiek na planecie Saturn to %.2f lat\n", planetAge);
                    break;
                }
                case 6 -> {
                    System.out.printf("Twoj wiek na planecie Uran to %.2f lat\n", planetAge);
                    break;
                }
                case 7 -> {
                    System.out.printf("Twoj wiek na planecie Neptun to %.2f lat\n", planetAge);
                    break;
                }
                case 8 -> {

                    System.out.printf("\nTwoj wiek na planecie Ziemia to %.2f lat\n", planetAge);
                    break;
                }
                case 9 -> {
                    System.out.println("Do widzenia!");
                    return;
                }
                default -> {
                    System.out.println("BŁĄD");
                    break;
                }
            }
        }
    }

    public static double howManyYears(int age, int planet) {
        double[] planetsAge = {0.2408467, 0.61519726, 1.8808158, 11.862615, 29.447498, 84.016846, 164.79132, 1.0, 1, 0};
        double totalAge;
        totalAge = age / (planetsAge[planet] * 31557600);
        return totalAge;
    }

     public static void Zad_13() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj rozmiar tablicy: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.println("Podaj " + size + " cyfr: ");
            for (int i = 0; i < size; i++) {
                int number = scanner.nextInt();
                array[i] = number;
            }
            sortRecursive(array, size);
            System.out.println("Posortowana tablica: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        }

        public static void sortRecursive(int[] array, int size) {
            if (size <= 1) {
                return;
            }
            for (int i = 0; i < size - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // zamiana miejscami
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            sortRecursive(array, size - 1);
        }
    }




