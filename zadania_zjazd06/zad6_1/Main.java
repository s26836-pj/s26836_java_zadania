import java.sql.SQLOutput;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}