public class Main {
    public static void main(String[] args) {
        System.out.println("Cambridge University: ");

        Instructor[] instructors = new Instructor[3];
        for (int j = 0; j < instructors.length; j++) {
            Instructor instructor = new Instructor("Instructor #" + j);

            for (int i = 0; i < 3; i++) {
                Student student = new Student((int) (Math.random() * 90 + 10), "Student #" + j + "-" + i, 3);

                for (int k = 0; k < 3; k++) {
                    student.setTestResult(k, (int) (Math.random() * 90 + 10));
                }

                instructor.setStudent(i, student);
            }
            instructors[j] = instructor;
        }
        University university = new University();
        university.setInstructors(instructors);
        university.printInstructors();
    }
}