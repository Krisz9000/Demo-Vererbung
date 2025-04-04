public class Main {
    public static void main(String[] args) {
        student ersterStudent = new student("Claudia", "Santa", 1234567);
        ersterStudent.einschreiben("Java 2");

        System.out.println(ersterStudent.Getvorname() + " " + ersterStudent.Getnachname());
    }
}