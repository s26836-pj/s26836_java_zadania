public class Student {
    private String name;
    private String surname;
    private String faculty;
    private int group;


    public Student(String name, String surname, String faculty, int group) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}


