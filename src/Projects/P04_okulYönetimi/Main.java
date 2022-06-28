package Projects.P04_okulYönetimi;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Esra", "Mat");
        Teacher t2 = new Teacher("Abdullah", "Tur");
        Teacher t3 = new Teacher("Mehmet", "Bio");

        Course c1 = new Course("Matematik", "Mat");
        Course c2 = new Course("Turkce", "Tur");
        Course c3 = new Course("Bioloji", "Bio");


        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);
        c1.printTeacher();
        c2.printTeacher();
        c3.printTeacher();


        Student s1 = new Student("Melisa", "2022202", "10", c1, c2, c3);
        s1.addBulkExamNote(c1, 80, 60);
        s1.addBulkExamNote(c2, 60, 70);
        s1.addBulkExamNote(c3, 40, 45);

    }
}

