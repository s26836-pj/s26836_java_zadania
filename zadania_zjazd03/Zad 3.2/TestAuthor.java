public class TestAuthor {
    public static void main(String[] args) {

        Author author1 = new Author("Boleslaw", "Klocek", 5);
        Author author2 = new Author("Jacek", "Kowalki", 10);



        System.out.println(author1.toString());
        author1.setSurname("Kloc");
        System.out.println(author1.toString());
        System.out.println(author2.toString());
        author2.setSurname("Kowalski");
        System.out.println(author2.toString());
    }
}

