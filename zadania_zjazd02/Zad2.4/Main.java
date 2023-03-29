import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Compare compare = new Compare();

//       compare.setWord2("jajko");            //test

        System.out.println("str1:" + compare.getWord());
        System.out.println("str2:" + compare.getWord2());
        System.out.println("\n str1 = str2:\n" + compare.areEqual());
        System.out.println("\nstr1.equals(str2): " + compare.areEqual());

    }
}