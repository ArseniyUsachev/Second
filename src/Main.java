import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student name: ");
        String studentName = scanner.nextLine();
        System.out.println("Student age: ");
        int studentAge = scanner.nextInt();
        System.out.println("Student attempts: ");
        int studentAttempts = scanner.nextInt();
        Student student1 = new Student(studentAge, studentName, studentAttempts);
        for (int i = 0; i < studentAttempts; i++) {
            System.out.println("Enter mark for attempt number " + i + " : ");
            int mark = scanner.nextInt();
            student1.setTestResult(i, mark);
        }
        System.out.println("Average mark for student " + student1.getName() + " (" + student1.getAge() + "): " + student1.getAverageResult());

        System.out.println("Instructor #1");

        Instructor instructor1 = new Instructor(26, "Instructor1");
        for (int i = 0; i < 3; i++) {
            Student student = new Student((int)(Math.random() * 90 + 10), "Student # " + i, 5);
            instructor1.setStudent(i, student);
        }
        instructor1.printStudents();
        for (int i = 0; i < 3; i++) {
            Instructor instructor = new Instructor((int)Math.random() *90 + 10), "Instructor # " + i, 5);

        }
        Instructor instructor2 = new Instructor(20, "Instructor2");
        for (int i = 0; i < 3; i++) {
            Student student = new Student((int)(Math.random() * 90 + 10), "Student # " + i, 5);
            instructor1.setStudent(i, student);
        }
        instructor1.printStudents();
        for (int i = 0; i < 3; i++) {
            Instructor instructor = new Instructor((int)Math.random() *90 + 10), "Instructor # " + i, 5);




        }
}


