import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie: ");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String surname = scanner.nextLine();
        System.out.println("Podaj kierunek: ");
        String faculty = scanner.nextLine();
        System.out.println("Podaj grupe: ");
        int group = scanner.nextInt();


        Student student = new Student(name, surname, faculty, group);

        System.out.println("Imie: " + student.getName() );
        System.out.println("Nazwisko: " + student.getSurname() );
        System.out.println("Kierunek: " + student.getFaculty() );
        System.out.println("Grupa: " + student.getGroup() );

    }
}