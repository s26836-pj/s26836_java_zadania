public class Author {

   private final String name;
   private String surname;
   private final int age;

    public Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }



    public String toString() {
        return "Author name = " + name + ", "+ " surname = " + surname
                + ", " + "age = " + age;
    }
}
